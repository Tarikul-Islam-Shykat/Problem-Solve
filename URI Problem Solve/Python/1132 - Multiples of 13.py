x=int(input())
y=int(input())
sum=0
if x<y:
    while x < y + 1:
        if x % 13 != 0:
            sum = sum + x
        x = x + 1
else:
    while y < x + 1:
        if y % 13 != 0:
            sum = sum + y
        y=y+1

print(sum)
