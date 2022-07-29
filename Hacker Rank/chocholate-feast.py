
#https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=false

if __name__ == '__main__':
    test = int(input())


    for i in range(test):
        money , cost , wrapprer = map(int, input().split())
        total = 0

        choc_bar = int(money/cost)

        total = total + choc_bar

        while True:

            val1 = choc_bar // wrapprer
            val2 = choc_bar % wrapprer

            total = total + val1


            choc_bar = val1 + 1
            if val1 == 0 or val2 == 0:
                break


        print(total)
       # print(choc_bar//wrapprer)
        # print(choc_bar%wrapprer)


# 6/11
