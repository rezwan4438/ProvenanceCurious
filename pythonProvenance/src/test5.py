#daysMonth = 30
#conv1 = 100
#irrArea = pcr.scalar('irra.map')
#kc = pcr.scalar('kctotal.map')
#t1p= pcr.readmap('t1p.map') #potential transpiration from soil layer 1 (m/day)
#t2p= pcr.readmap('t2p\\t2p0%04d.%03d' % (year,month)) #potential transpiration from soil layer 2 (m/day)
#tp1Crop = kc * (t1p) * daysMonth * irrArea / conv1
#tp1Crop = kc * (t2p) * daysMonth * irrArea / conv1
#a = pcr.cover(0.,pcr.min(1.,c/b))
#irrArea = pcr.readmap('irrArea.map'%(year,month))
#irrAreaFra= pcr.ifthen(clone,pcr.cover(pcr.min(1.,(irrArea)/irrArea2000),0.))
a = 5
b = 10
c = a + b
a = a + 100
c = a

#d = a + c
#a = c
#d = a + c
#pcr.report(irrRetn,'results\\irrn\\irrn%04d.%03d' % (year,month))
#cloneFile= ('globalclone.map')
#pcr.setclone(cloneFile)




