if __name__ == '__main__':

    arr = []
    #v = int(input())
    test = int(input())
    #arr = list(map(int,input().strip().split()))[:test]

    for i in range(test):
        val = input()
        arr.append(int(val))


    arr.sort()
    arr2 = arr.copy()

    for i in range(len(arr2)):
        print(arr2[i])
