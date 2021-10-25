lin=input().split(" ")
A, B=lin
if int(B)%int(A)==0 or int(A)%int(B)==0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
