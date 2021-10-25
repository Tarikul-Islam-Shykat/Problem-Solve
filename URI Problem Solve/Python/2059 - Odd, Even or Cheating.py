linha=input().split(" ")
p, j1, j2, r, a = linha

if int(r)==1 and int(a)==0:
     print("Jogador 1 ganha!")
elif int(r)==0 and int(a)==1:
    print("Jogador 1 ganha!")
elif int(r)==1 and int(a)==1:
    print("Jogador 2 ganha!")
elif int (p)==0 and ((int(j1)+int(j2))%2)!=0:
    print("Jogador 1 ganha!")
elif int (p)==1 and ((int(j1)+int(j2))%2)==0:
    print("Jogador 1 ganha!")
else:
    print("Jogador 2 ganha!")
