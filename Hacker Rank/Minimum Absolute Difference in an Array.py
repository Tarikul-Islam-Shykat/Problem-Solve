if __name__ == '__main__':

    arr = []
    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]

    sum = []
    for i in range(len(arr)):
        val = arr[i]
        for j in range(len(arr)):
            if j == i:
                pass
            else :
                sum.append(abs(val - arr[j]))
                #print(arr[j])


    print(min(sum))
