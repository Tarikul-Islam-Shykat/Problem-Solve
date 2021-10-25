input1=input()
input2=input()
input3=input()

if input1.casefold()=="vertebrado":
    if input2.casefold()=="ave":
        if input3.casefold() == "carnivoro":
            print("aguia")
        elif input3.casefold() == "onivoro":
            print("pomba")
    elif input2.casefold()=="mamifero":
        if input3.casefold() == "herbivoro":
            print("vaca")
        elif input3.casefold() == "onivoro":
            print("homem")

elif input1.casefold()=="invertebrado":
    if input2.casefold()=="inseto":
        if input3.casefold() == "hematofago":
            print("pulga")
        elif input3.casefold() == "herbivoro":
            print("lagarta")
    elif input2.casefold()=="anelideo":
        if input3.casefold() == "hematofago":
            print("sanguessuga")
        elif input3.casefold() == "onivoro":
            print("minhoca")
