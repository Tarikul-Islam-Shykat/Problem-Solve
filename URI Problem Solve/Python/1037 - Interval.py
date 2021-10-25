n=input()

if float(n)>=0.00 and float(n)<=100.00:
    if float(n)>=0.00 and float(n)<=25.00:
        print("Intervalo [0,25]")
    elif float(n)>25.00 and float(n)<=50.00:
        print("Intervalo (25,50]")
    elif float(n)>50.00 and float(n)<=75.00:
        print("Intervalo (50,75]")
    elif  float(n)>75.00 and float(n)<=100.00:
        print("Intervalo (75,100]")
else:
    print('Fora de intervalo')
