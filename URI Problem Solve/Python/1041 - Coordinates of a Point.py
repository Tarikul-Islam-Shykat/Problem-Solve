lin=input().split(" ")
x,y=lin
if float(x)==0 and float(y)==0:
    print("Origem")
elif float(x)==0:
    print("Eixo Y")
elif float(y)==0:
    print("Eixo X")
elif float(x)>0 and float(y)>0:
    print("Q1")
elif float(x)<0 and float(y)>0:
    print("Q2")
elif float(x)<0 and float(y)<0:
    print("Q3")
else:
    print("Q4")
