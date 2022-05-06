if __name__ == '__main__':
    test = int(input())

    for i in range(test):
        str1 = input()
        str2 = input()
        resutl = ""
        for j in range(len(str1)):
            for k in range(len(str2)):
                if(ord(str1[j])==ord(str2[k])):
                    resutl = "YES"
                    break
            if(resutl== "YES"):
                break
        if(resutl == "YES"):
            print("YES")
        else:
            print("NO")
