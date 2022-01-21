if __name__ == '__main__':
    n = int(input())
    result = {}
    for i in range (n):
        details = list(input().split(" "))
        name = details[0]
        value = details[1:]
        result[name]= value
# gets a dictionay in this manner {'Krishna': ['67', '68', '69'], 'Arjun': ['70', '98', '63'], 'Malika': ['52', '56', '60']}
    desired_result = input()
    for x, y in result.items():
        if(x == desired_result):
            val = list(y)
            sum =0
            for x in val:
                sum = sum+ float(x)

            print("%.2f"%(sum/3))
