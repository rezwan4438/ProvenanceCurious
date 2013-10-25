import math

data = [1,2,1,3,1,2,2,1]

WS = 4
TR = 1

# alternative 3: classical loop - determining number of executions first
print 'loop3 WS=', WS, ' TR=', TR, ':',

for i in range(0,int(math.ceil(len(data)/float(TR))),1):
    m = max(0,(i*TR)+1-WS)
    sum = 0
    for j in range(m,i*TR+1,1):
        sum += data[j]
    print sum ,', ',

print '\n'


