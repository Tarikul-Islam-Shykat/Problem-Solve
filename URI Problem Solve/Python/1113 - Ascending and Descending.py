while True:
    X,Y=list(map(int,input().split()))
    if(X==Y):
        break
    elif(X<Y):
        print("Crescente")
    elif X>Y:
        print("Decrescente")
