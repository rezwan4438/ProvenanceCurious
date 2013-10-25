import PCRaster as pcr
firstInput = pcr.readmap('first_map')
for year in range(1960, 2001, 1):
		secondInput = pcr.readmap('second_map_%04d'%(year))
		sum = firstInput + secondInput
		pcr.report(sum, 'sum_map_%04d'%(year))








