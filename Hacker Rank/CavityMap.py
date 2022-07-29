
#https://www.hackerrank.com/challenges/common-child/problem?isFullScreen=false

if __name__ == '__main__':
    arr = []

    #test = int(input())
    test = int(input())

    for i in range(test):
        val = input()
        x = [str(a) for a in str(val)]
        arr.append(x)

    length = len(arr[0])
    for i in range(test):
        for k in range(1, length-1):
            val_ = arr[i][k]

            next_val =  arr[i][k+1]
            prev_val = arr[i][k-1]

            if val_ > prev_val and val_ >  next_val:
                a = 'X'
                arr[i][k] = a


    for m in range(len(arr)):
        for n in range(length):
            print(arr[m][n],end='')
        print()
