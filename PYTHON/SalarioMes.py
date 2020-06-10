print("********** Cálculo do salário Mensal **********")
salariohora = float(input("Quanto você ganha por hora? "))
horastrabalhadas = int(input("Quantas horas você trabalha por mês? "))

salariobruto = salariohora * horastrabalhadas

impostorenda = (11/100) * salariobruto
inss = (8/100) * salariobruto
sindicato = (5/100) * salariobruto

totaldescontos = impostorenda + inss + sindicato

salarioliquido = salariobruto - totaldescontos

print(" ")
print("*********************************************")
print("+ Salário Bruto: R$", salariobruto)
print("- IR (11%): R$", impostorenda)
print("- INSS (8%): R$", inss)
print("- Sindicato (5%): R$", sindicato)
print("+ Salário Líquido: R$", salarioliquido)
print("*********************************************")
