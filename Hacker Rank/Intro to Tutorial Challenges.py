if __name__ == '__main__':

    arr = []
    v = int(input())
    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]


    arr.sort()
    arr2 = arr.copy()

    print(arr2.index(v))
