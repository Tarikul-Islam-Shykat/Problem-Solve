l=0
max = 0
for count in range(100):
    input1=int(input())
    if(input1>max):
        max=input1
        l=count+1
print(max)
print(l)
