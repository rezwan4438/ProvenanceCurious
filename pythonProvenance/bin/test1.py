##Estimate green water demand for irrigation per time step
##and subsequently consumptive blue water use for irrigation and groundwater abstraction
##Corrected total water demand is used to calculate modified river discharge
##Yoshihide Wada, Last updated on 06/Feb/2012

#Modules
import os, calendar
import PCRaster as pcr

#Run time
staYear= int(2000)
endYear= int(2001)
staMonth= int(1)
endMonth= int(13)
timeStep= int(1)

#Global input
cloneFile= ('globalclone.map')
pcr.setclone(cloneFile)
clone= pcr.readmap(cloneFile)
cellArea= pcr.readmap('cellarea30.map')
LDD= pcr.readmap('globalldd.map')
country= pcr.readmap('country.map')
gwab2000= pcr.readmap('groundwater\\gwab_2000_mlnm3.map')
efficiency= pcr.readmap('efficiency\\efficiency.map')
rf1= pcr.readmap('rf\\rfcrops1.map')
rf2= pcr.readmap('rf\\rfcrops2.map')
kfc2= pcr.readmap('irrigation\\kfc100.map')  

#import from PCR-GLOBWB per calibration time step
##esp= 'PCRGLOBWB\\esp\\esp0%04d.%03d' #potential bare soil evaporation (m/day)
##esa= 'PCRGLOBWB\\esa\\esac%04d.%03d' #actual bare soil evaporation (m/day)
##t1p= 'PCRGLOBWB\\t1p\\t1p0%04d.%03d' #potential transpiration from soil layer 1 (m/day)
##t2p= 'PCRGLOBWB\\t2p\\t2p0%04d.%03d' #potential transpiration from soil layer 2 (m/day)
##t1a= 'PCRGLOBWB\\t1a\\t1a0%04d.%03d' #actual transpiration from soil layer 1 (m/day)
##t2a= 'PCRGLOBWB\\t2a\\t2a0%04d.%03d' #actual transpiration from soil layer 1 (m/day)
##qloc= 'PCRGLOBWB\\qloc\\qloc%04d.%03d' #local runoff (m/day)
##rivDis= 'PCRGLOBWB\\qloc\\qloc%04d.%03d' #river discharge (m3/second)
grwRch= pcr.readmap('PCRGLOBWB\\recharge\\r3avg19582001_mlnm3.map') #groundwater recharge (million m3/year)

print '\trun irrigation script'
#initialization
yCnt= 0
conv1= int(100)
conv2= cellArea/(86400) #m/day => m3/second

#make lists
totDemandList= [pcr.scalar(0) for year in range(endYear-staYear)]
irrRetnList= [pcr.scalar(0) for year in range(endYear-staYear)]

#calculate consumptive blue water use for irrigation and subsequently total water demand
print '\tclculate irrigation and total blue water demand'
for year in range(staYear,endYear,timeStep):  
        print year,
        totDemandAnn= pcr.scalar(0)
        irrRetnAnn= pcr.scalar(0)
        #real irrigated areas (hectare)
        irrArea2000= pcr.scalar('irrigation\\irra2000.map')
        irrArea= pcr.scalar('irrigation\\irra%04d.map' % (year))
        irrAreaFra= pcr.ifthen(clone,pcr.cover(pcr.min(1.,(irrArea)/irrArea2000),0.))
        for month in range(staMonth,endMonth,timeStep):
                tp1Crop= pcr.scalar(0)
                tp2Crop= pcr.scalar(0)
                t1Fra= pcr.scalar(0)
                t2Fra= pcr.scalar(0)
                taCrop= pcr.scalar(0)
                irlCrop= pcr.scalar(0)
                inCrop= pcr.scalar(0)
                totDemand= pcr.scalar(0)
                #import from PCR-GLOBWB per calibration time step
                esp= pcr.readmap('PCRGLOBWB\\esp\\esp0%04d.%03d' % (year,month)) #potential bare soil evaporation (m/day)
                esa= pcr.readmap('PCRGLOBWB\\esa\\esac%04d.%03d' % (year,month)) #actual bare soil evaporation (m/day)
                t1p= pcr.readmap('PCRGLOBWB\\t1p\\t1p0%04d.%03d' % (year,month)) #potential transpiration from soil layer 1 (m/day)
                t2p= pcr.readmap('PCRGLOBWB\\t2p\\t2p0%04d.%03d' % (year,month)) #potential transpiration from soil layer 2 (m/day)
                t1a= pcr.readmap('PCRGLOBWB\\t1a\\t1a0%04d.%03d' % (year,month)) #actual transpiration from soil layer 1 (m/day)
                t2a= pcr.readmap('PCRGLOBWB\\t2a\\t2a0%04d.%03d' % (year,month)) #actual transpiration from soil layer 1 (m/day)
                #import number of days per month (days)
                daysMonth= calendar.monthrange(year,month)
                daysMonth= daysMonth[1]
                #read crop factor (-)
                kc= pcr.scalar('cropFactor\\kctotal0.0%02d' % (month))
                #calculate potential crop transpiration per layer (million m3/month)
                tp1Crop= kc*(t1p)*daysMonth*irrArea/conv1
                tp2Crop= kc*(t2p)*daysMonth*irrArea/conv1
                #calculate fractions of actual to potential transpiration (-)
                t1Fra= pcr.ifthen(clone,pcr.cover(pcr.min(1.,t1a/t1p),0.))
                t2Fra= pcr.ifthen(clone,pcr.cover(pcr.min(1.,t2a/t2p),0.))
                #calculate actual crop transpiration (million m3/month)
                taCrop= (tp1Crop*rf1*t1Fra)+(tp2Crop*rf2*t2Fra)
                #calculate irrigation loss
                irlCrop= pcr.max(0.,esp - esa)*daysMonth*irrArea/conv1
                #calculate consumptive blue water use for irrigation (million m3/month)
                inCrop= ((tp1Crop+tp2Crop)-taCrop+irlCrop)*(1.+(1.-efficiency))
                pcr.report(inCrop,'results\\incr\\incr%04d.%03d' % (year,month))
                #read other demands (-)
                otherDemands= pcr.scalar('otherWDs\\othr%04d.0%02d' % (year,month))
                #calculate total water demand (million m3/month)
                totDemand= inCrop+otherDemands
                pcr.report(totDemand,'results\\totd\\totd%04d.0%02d' % (year,month))
                #calculate annual total water demand (million m3/year)
                totDemandAnn= totDemandAnn+totDemand
                #estimate return flow from irrigation (million m3/year)
                frShort= pcr.scalar('irrigation\\frshort0.0%02d' % (month))
                frTall= pcr.scalar('irrigation\\frtall00.0%02d' % (month))
                percFc= kfc2*((frShort+frTall)*irrAreaFra)*daysMonth*cellArea/1000000
                irrRch= (((1+1-efficiency))/(1+((1+1-efficiency))))*inCrop
                irrRetn= pcr.min(percFc,irrRch)
                pcr.report(irrRetn,'results\\irrn\\irrn%04d.%03d' % (year,month))
                irrRetnAnn= irrRetn + irrRetnAnn
        totDemandList[yCnt]= pcr.scalar(totDemandAnn)
        irrRetnList[yCnt]= pcr.scalar(irrRetnAnn)
        yCnt+=1

#downscale country groundwater abstraction into a grid scale based
#on a deficit of water demand over water availability per grid cell
print '\tcalculate modified discharge'


