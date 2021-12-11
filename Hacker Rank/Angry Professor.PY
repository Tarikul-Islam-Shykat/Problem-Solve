def angryProf(k,a):

    counter = 0
    for i in a:
        if i <= 0:
            counter+=1
    
    return "YES" if counter<k else "NO"
    


for i in range(int(input())):
    n,k = map(int, input().split())
    a = map(int, input().split())
    
    print(angryProf(k, a))
