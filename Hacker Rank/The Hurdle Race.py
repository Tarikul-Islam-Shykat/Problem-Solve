n,k = map(int,input().split())
height = map(int,input().split())

max = int(max(height))
if max < k:
    print(0)
elif max>k:
    print(max-k)
