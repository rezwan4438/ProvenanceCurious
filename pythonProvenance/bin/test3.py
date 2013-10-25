import PCRaster as pcr

staYear = int(1960)
endYear = int(2001)
timeStep = int(1)

for year in range(staYear,endYear,timeStep): 
	irrArea= pcr.scalar('irrigation\\irra%04d.map' % (year))

#		for month in range(staMonth,endMonth,timeStep):
#				totDemand= 10
#				otherDemands= pcr.scalar('otherWDs\\othr%04d.0%02d' % (year,month))
#				totDemandAnn = otherDemands + totDemand
#		totDemandList[yCnt]= pcr.scalar(totDemandAnn)
#        yCnt+=1
