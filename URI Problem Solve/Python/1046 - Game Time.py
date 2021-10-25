lin=input().split(" ")
a,b=lin
if int(a)<int(b):
    l=int(b)-int(a)
    print('O JOGO DUROU %i HORA(S)'%l)
elif a==b:
    print("O JOGO DUROU 24 HORA(S)")
elif int(a)>int(b):
    l=(24-int(a))+int(b)
    print('O JOGO DUROU %i HORA(S)'%l)
