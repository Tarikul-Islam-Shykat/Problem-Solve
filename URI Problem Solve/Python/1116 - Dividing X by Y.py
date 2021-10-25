counter=int(input())

for i in range(counter):
    x,y=list(map(float, input().split()))
    try:
        print('%.1f' % (x/y))
    except:
        print("divisao impossivel")
