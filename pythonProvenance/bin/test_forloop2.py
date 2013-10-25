import math

data = [1,2,1,3,1,2,2,1]

WS = 4

TR = 2

# alternative 2: classical loop - with increment for trigger
print 'loop2 WS=', WS, ' TR=', TR, ':',

for i in range(0,len(data),TR):
    m = max(0,i+1-WS)
    sum = 0
    for j in range(m,i+1,1):
        sum += data[j]
    print sum ,', ',

print '\n'

