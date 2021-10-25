Alcohol=0
Gasoline=0
Diesel=0
input1=0
while input1!=4:
    input1=int(input())

    if(input1==1):
        Alcohol=Alcohol+1
    if(input1==2):
        Gasoline=Gasoline+1
    if input1==3:
        Diesel=Diesel+1
print("MUITO OBRIGADO")
print("Alcool: %d"%Alcohol)
print("Gasolina: %d"%Gasoline)
print("Diesel: %d"%Diesel)
