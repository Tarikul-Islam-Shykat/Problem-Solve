
if __name__ == '__main__':
    d1 = input().split(" ")
    d2 = input().split(" ")
    fine = 0
    r_date, r_month, r_year = int(d1[0]),int(d1[1]),int(d1[2])
    d_date, d_month, d_year = int(d2[0]),int(d2[1]),int(d2[2])

    if r_date<=d_date and r_month<=d_month and r_year <= d_year:
        print(fine)
    elif r_date > d_date and r_month==d_month and r_year == d_year:
        fine = r_date - d_date
        print(fine*15)
    elif r_month>d_month and r_year == d_year:
        fine = r_month-d_month
        print(fine*500)
    elif r_year>d_year:
        print(10000)
