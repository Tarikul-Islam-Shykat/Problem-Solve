number = int(input())
while number>0:
    give_your_number = int(input())
    sum=0
    for divisor in range(2,give_your_number):
        if give_your_number%divisor==0:
            sum=sum+1
    if sum>0:
        print("%d nao eh primo"%give_your_number)
    else:
        print("%d eh primo"%give_your_number)
    number=number-1
