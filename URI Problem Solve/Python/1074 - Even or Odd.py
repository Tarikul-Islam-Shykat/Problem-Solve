count=int(input())
for i in range(count):
    input1=int(input())
    if(input1==0):
        print("NULL")

    elif(input1>0):
        if(input1%2==0):
            print("EVEN POSITIVE")
        else:
            print("ODD POSITIVE")
    elif(input1<0):
        if (input1 % 2 == 0):
            print("EVEN NEGATIVE")
        else:
            print("ODD NEGATIVE")
