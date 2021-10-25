salary = float(input())

if salary >=0 and salary <= 400.00:
    add_salary = float((salary * (15 / 100)))
    total_salary = float(salary + add_salary)
    print("Novo salario: %.2f"%total_salary  )
    print("Reajuste ganho: %.2f"%add_salary)
    print("Em percentual: 15 %")
elif salary >=400.01 and salary <= 800.00:
    add_salary = (salary * (12 / 100))
    total_salary = salary + add_salary    
    print("Novo salario: %.2f"%total_salary  )
    print("Reajuste ganho: %.2f"%add_salary)
    print("Em percentual: 12 %")
elif salary >=800.01 and salary <= 1200.00:
    add_salary = (salary * (10 / 100))
    total_salary = salary + add_salary
    print("Novo salario: %.2f" % total_salary)
    print("Reajuste ganho: %.2f" % add_salary)
    print("Em percentual: 10 %")
elif salary >=1200.01 and salary <= 2000.00:
    add_salary = (salary * (7 / 100))
    total_salary = salary + add_salary
    print("Novo salario: %.2f" % total_salary)
    print("Reajuste ganho: %.2f" % add_salary)
    print("Em percentual: 7 %")

elif salary >=2000.00:
    add_salary = (salary * (4 / 100))
    total_salary = salary + add_salary
    print("Novo salario: %.2f"%total_salary  )
    print("Reajuste ganho: %.2f"%add_salary)
    print("Em percentual: 4 %")
