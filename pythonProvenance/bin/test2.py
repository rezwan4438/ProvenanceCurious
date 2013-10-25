#calculate groundwater abstraction per country for 2000 (million m3/month)
yCnt= 0
gwab2000Cnt= pcr.areatotal(gwab2000,country)
for year in range(staYear,endYear,timeStep):
        gwab= pcr.scalar(0)
        gwabCnt= pcr.scalar(0)
        gwabTot= pcr.scalar(0)
        deficitAnn= pcr.scalar(0)
        deficitTot= pcr.scalar(0)
        surplusCnt= pcr.scalar(0)
        gwabSurplus= pcr.scalar(0)
        gwabDeficit= pcr.scalar(0)
        nrgwAnn= pcr.scalar(0)
        corDemandMon= pcr.scalar(0)
        #estimate past groundwater abstraction proportional to
        #past water demand (million m3/year)
        gwab= gwab2000*((totDemandList[yCnt])/(totDemandList[40]))
        gwab= pcr.ifthenelse(clone,pcr.cover(gwab,0.),0.)
        #calculate country groundwater abstraction (million m3/year)
        gwabCnt= pcr.areatotal(gwab,country)
        for month in range(staMonth,endMonth,timeStep):
                rivDisMon= pcr.readmap('PCRGLOBWB\\qloc\\qloc%04d.%03d' % (year,month)) #river discharge (m3/second)
                rivDisMon= rivDisMon*86400*30/1000000
                totDemandMon= pcr.readmap('results\\totd\\totd%04d.%03d' % (year,month)) #total water demand (million m3/month)
                deficit= pcr.max(0.,totDemandMon-rivDisMon)
                #calculate annual deficits (million m3/year)
                deficitAnn= deficitAnn+deficit
                deficitTot= deficitAnn
        #limit the deficit over regions where groundwater is abstracted
        deficitAnn= pcr.ifthenelse(gwabCnt>0.,deficitAnn,0.)
        deficitCnt= pcr.areatotal(deficitAnn,country)
        #calculate the remainder of country groundwater
        #abstraction (million m3/year)
        surplusCnt= pcr.max(0.,gwabCnt-deficitCnt)
        deficitAnn= pcr.ifthenelse(surplusCnt==0.,0.,deficitAnn)
        #allocate the remainder relative to total water demand
        #(million m3/year)
        gwabSurplus= surplusCnt*(totDemandList[yCnt]/\
                (pcr.areatotal(totDemandList[yCnt],country)))
        gwabSurplus= pcr.ifthen(clone,pcr.cover(gwabSurplus,0.))
        #allocate the dificit relative to its intensity in case
        #the dificit is larger than the country groundwater
        #abstraction (million m3/year)
        gwabDeficit= pcr.ifthenelse(surplusCnt==0.,gwabCnt,0.)
        gwabDeficit= gwabDeficit*(deficitTot/(pcr.areatotal\
                (deficitTot,country)))
        gwabDeficit= pcr.ifthen(clone,pcr.cover(gwabDeficit,0.))
        #sum all of the components
        gwabTot= deficitAnn+gwabSurplus+gwabDeficit
        #calculate non-renewable groundwater abstraction
        #(million m3/year)
        nrgwAnn= pcr.max(0.,gwabTot-(grwRch+irrRetnList[yCnt]))
        pcr.report(nrgwAnn,'results\\nrgw\\nrgw%04d.map' % (year))
        for month in range(staMonth,endMonth,timeStep):
                #import number of days per month (days)
                daysMonth= calendar.monthrange(year,month)
                daysMonth= daysMonth[1]
                totDemandMon= pcr.readmap('results\\totd\\totd%04d.0%02d' % (year,month))
                twdFrac= pcr.ifthen(clone,pcr.cover(totDemandMon/totDemandList[yCnt],0.))
                nrgwMon= nrgwAnn*twdFrac
                #correct total water demand by subtracting non-renewable
                #groundwater abstraction (million m3/month)
                corDemandMon= pcr.max(0.,totDemandMon-nrgwMon)
                pcr.report(corDemandMon,'results\\ctotd\\ctwd%04d.0%02d' % (year,month))
                #reduce corrected water demand from river discharge (m3/second)
                qloc= pcr.readmap('PCRGLOBWB\\qloc\\qloc%04d.%03d' % (year,month)) #local runoff (m/day)
                qloc= qloc*conv2
                corDemandMon= corDemandMon*(1000000/(86400*daysMonth))
                rivDisMod= pcr.accuthresholdflux(LDD,qloc,corDemandMon)
                pcr.report(rivDisMod,'results\\rivDis\\qmod%04d.0%02d' % (year,month))
        yCnt+=1
print '\trun finished'
