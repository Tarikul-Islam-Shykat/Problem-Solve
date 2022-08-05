if __name__ == '__main__':

    arr = []
    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]

    for i in range(1, len(arr)):
        j = i
        while arr[j-1] > arr[j] and j > 0:
            arr[j-1], arr[j] = arr[j], arr[j-1]
            j -= 1
        print(*arr, sep = ' ')
 

# https://www.hackerrank.com/challenges/insertionsort2/problem?isFullScreen=false
