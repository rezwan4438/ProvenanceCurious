import math

data = [1,2,1,3,1,2,2,1]

WS = 4
TR = 1

# alternative 4: incremental loop with additional states with list - if for trigger
print 'loop4 WS=', WS, ' TR=', TR, ':',
state = []
for j in range(0,WS,1):
    state.append(0);

sum = 0
for i in range(0,len(data),1):
    sum = sum-state[0]+data[i]
    if((i%TR)==0):
        print sum ,', ',
    del state[0]
    state.append(data[i])
    #print 'States: ', state2, 
print '\n'

