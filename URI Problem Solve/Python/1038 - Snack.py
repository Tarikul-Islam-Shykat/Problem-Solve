lin=input().split(" ")
X, Y=lin

if int(X)==1:
    l=float(Y)*4.00
    print("Total: R$ %.2f"%l)
elif int(X)==2:
    l = float(Y) * 4.50
    print("Total: R$ %.2f"%l)
elif int(X)==3:
    l = float(Y) * 5.00
    print("Total: R$ %.2f"%l)
elif int(X)==4:
    l = float(Y) * 2.00
    print("Total: R$ %.2f"%l)
elif int(X)==5:
    l = float(Y) * 1.50
    print("Total: R$ %.2f"%l)
