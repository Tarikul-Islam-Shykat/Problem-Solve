if __name__ == '__main__':
    n = int(input())
    result = {}
    for i in range (n):
        name = input()
        number = float(input())
        result[name]= number

    unique =sorted(list(set(result.values())))
    second_lowest_val = unique[1]

    sorted_name_list = []
    for  x, y  in result.items():
        if (y == second_lowest_val):
           sorted_name_list.append(x)

    for x in sorted(sorted_name_list):
        print(x)
