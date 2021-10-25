input1=int(input())
input2=int(input())
sum=0;
for i in range(input2+1,input1):
    if(i%2!=0):
        sum = sum + i
print(sum)
