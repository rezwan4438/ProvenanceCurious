
a = 12
b = 0

try:
    x = a/b
    print x
except:
    print 'divide by zero'
finally:
    a = 10

print a
