number = int(input())
while number>0:
    give_your_number = int(input())
    sum=0
    for divisor in range(1,give_your_number):
        if give_your_number%divisor==0:
            sum=sum+divisor
    if sum==give_your_number:
        print("%d eh perfeito"%give_your_number)
    else:
        print("%d nao eh perfeito"%give_your_number)
    number=number-1
