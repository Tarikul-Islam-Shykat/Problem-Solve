t1, t2, t3 = input().split()
t1 = int(t1)
t2 = int(t2)
t3 = int(t3)


if t1> t2 and t3>=t2:
    print(":)")

elif (t2 > t1) and t3<=t2:
    print(":(")

elif t2 > t1 and t3 > t2 and (t3-t2)< (t2-t1):
    print(":(")

elif t2>t1 and t3>t2 and (t3-t2)>=(t2-t1):
    print(":)")

elif t2<t1 and t3<t2 and (t2-t3)<(t1-t2):
    print(":)")

elif t2<t1 and t3<t2 and (t2-t3)>=(t1-t2):
    print(":(")

elif t2==t1:
    if t3>t2:
        print(":)")
    else:
        print(":(")
