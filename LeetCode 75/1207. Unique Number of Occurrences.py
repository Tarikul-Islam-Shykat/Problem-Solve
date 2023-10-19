if __name__ == "__main__":
    arr = [1,2,2,1,1,3]
    nums2 = [-3,0,1,-3,1,1,1,-3,10,0]
    arr2 = [1,2]

    dic = {}

    for i in arr :
        if i in dic:
            dic[i] +=1
        else:
            dic[i] = 1

    print(dic.values())
    print(set(arr))

    if len(set(dic.values())) == len(set(arr)):
        print("true")

    print("false")







