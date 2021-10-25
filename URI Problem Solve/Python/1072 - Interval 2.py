input1=int(input())
in_counter=0
out_counter=0
for i in range(input1):
    input2=int(input())
    if input2>=10 and input2<= 20 :
        in_counter=in_counter+1
    else:
        out_counter=out_counter+1

print("{} in".format(in_counter))
print("{} out".format(out_counter))
