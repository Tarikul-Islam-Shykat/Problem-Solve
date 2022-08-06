if __name__ == '__main__':

    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]

    test_arr = [0]*100
    for j in range(0, test):
        temp = arr[j]
        test_arr[temp] += 1

    print(*test_arr, sep =' ') 
