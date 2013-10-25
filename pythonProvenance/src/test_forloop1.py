import math

data = [1,2,1,3,1,2,2,1]

WS = 4
TR = 1

# alternative 1: classical loop - with if for trigger
print 'loop1 WS=', WS, ' TR=', TR, ':',

for i in range(0,len(data),2):
    m = max(0,i+1-WS)
    sum = 0
    if((i%TR)==0):
        for j in range(m,i+1,1):
            sum += data[j]
        print sum ,', ',

print '\n'

