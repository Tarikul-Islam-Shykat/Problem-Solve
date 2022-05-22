arr = []
for i in range(6):
    arr.append(list(map(int, input().split())))

sums = []
for j in range(6):
    k =0
    count = 0
    if(j == 4):
        break

    while count != 4:
        sum = 0
        #print(arr[j][k+0], arr[j][k+1], arr[j][k+2])
        #print(arr[j+1][k+1])
        #print(arr[j+2][k+0], arr[j+2][k+1], arr[j+2][k+2])
        sum = sum + arr[j][k+0]+ arr[j][k+1] + arr[j][k+2]
        sum = sum + arr[j+1][k+1]
        sum = sum + arr[j+2][k+0] + arr[j+2][k+1] +arr[j+2][k+2]
        #print(sum)
        sums.append(sum)
        k = k +1
        count +=1

print(max(sums))
