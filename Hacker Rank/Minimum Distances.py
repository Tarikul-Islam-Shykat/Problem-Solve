if __name__ == '__main__':
    test_ = int(input())
    list = []
    n = input().split(" ")
    for i in range(len(n)):
        list.append(int(n[i]))


    list2 =[]
    for i in range(len(list)):
        val = list[i]
        for j in range(i+1, len(list)):
            if(list[i] == list[j]):
                list2.append(j-i)

    if list2:
        print(min(list2))
    else:
        print("-1")
