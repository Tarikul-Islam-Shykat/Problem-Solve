# https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=false

def findMiddle(input_list):
    middle = float(len(input_list))/2
    if middle % 2 != 0:
        return input_list[int(middle - .5)]
    else:
        return (input_list[int(middle)], input_list[int(middle-1)])



if __name__ == '__main__':

    arr = []
    test = int(input())
    arr = list(map(int,input().strip().split()))[:test]

    '''for i in range(test):
        val = int(input())
        arr.append(val)'''


    arr.sort()
    arr2 = arr.copy()
    print(findMiddle(arr2))
