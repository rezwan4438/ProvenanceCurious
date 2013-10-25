import math

data = [1,2,1,3,1,2,2,1]

WS = 4
TR = 1

# alternative 5: incremental loop with additional states with a pointer - if for trigger
print 'loop5 WS=', WS, ' TR=', TR, ':',
state = [0,0,0,0]
pointer = 0
sum = 0
for i in range(0,len(data),1):
    sum = sum-state[pointer]+data[i]
    state[pointer]=data[i]
    new_pointer = pointer + 1
    pointer = new_pointer % WS
    if((i%TR)==0):
        print sum ,', ',

print '\n'


