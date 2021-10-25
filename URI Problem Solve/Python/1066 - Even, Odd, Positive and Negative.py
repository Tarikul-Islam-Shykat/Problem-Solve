count1=0
count2=0
count3=0
count4=0
for i in range(1,6):
    n =int(input())
    if (n % 2 == 0):
        count1 = count1 + 1
    if(n%2!=0):
        count2=count2+1
    if (n>0):
        count3 = count3 + 1
    if (n<0):
        count4 = count4 + 1

print("{} valor(es) par(es)".format(count1))
print("{} valor(es) impar(es)".format(count2))
print("{} valor(es) positivo(s)".format(count3))
print("{} valor(es) negativo(s)".format(count4))
