counter=0
sum=0

while counter<2:
    number=float(input())
    if number>=0.0 and number<=10.0:
        sum=sum+number
        counter=counter+1
    else:
        print("nota invalida")
print("media = %.2f" %(sum/2))
