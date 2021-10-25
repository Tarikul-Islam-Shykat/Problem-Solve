lin=input().split(" ")
A, B, C=lin
if float(A)<(float(B)+float(C)) and float(B)<(float(A)+float(C))and float(C)<(float(A)+float(B)):
    l=float(A)+float(B)+float(C)
    print("Perimetro = %.1f"%l)
else:
    l=((float(A)+float(B))*float(C))/2
    print("Area = %.1f"%l)
