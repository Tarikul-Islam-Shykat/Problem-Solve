test = int(input())
given = "hackerrank"

while test>0:
    check_string = input()
    total_count = 0
    c = 0 # given string length

    for i in range(len(check_string)):
        if c == len(given):
            break
        if check_string[i] == given[c]:
            total_count+=1
            c+=1

    #print(total_count)
    #print(len(given))
    if(total_count == len(given)):
        print("YES")
    else:
        print("NO")
    test-=1
