if __name__ == '__main__':

    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]

    test_arr = [0]*test
    for j in range(0, test):
        temp = arr[j]
        test_arr[temp] += 1

    for i in range(test):
        if test_arr[i] > 0:
            print(" ".join([str(i)] * test_arr[i]), end=" ")

# https://www.hackerrank.com/challenges/countingsort1/problem?isFullScreen=false
