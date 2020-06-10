print("********** FOLHA DE PAGAMENTO **********")
salariohora = float(input("Quanto você ganha por hora? "))
horastrabalhadas = int(input("Quantas horas você trabalha por mês? "))

salariobruto = salariohora * horastrabalhadas
impostorenda = 0
porcentagemir = 0
if(salariobruto > 900 and salariobruto <= 1500):
    porcentagemir = 5
    impostorenda = (5/100) * salariobruto
if(salariobruto > 1500 and salariobruto <=2500):
    porcentagemir = 10
    impostorenda = (10/100) * salariobruto
if(salariobruto > 2500):
    porcentagemir = 20
    impostorenda = (20/100) * salariobruto

inss = (10/100) * salariobruto
sindicato = (3/100) * salariobruto
fgts = (11/100) * salariobruto

totaldescontos = impostorenda + inss

salarioliquido = salariobruto - totaldescontos

print(" ")
print("*********************************************")
print("Salário Bruto: (", salariohora, "*", horastrabalhadas, "):  R$ ", salariobruto)
print("(-) IR (", porcentagemir, "%):                R$ ", impostorenda)
print("(-) INSS (10%):                R$ ", inss)
print("FGTS (11%):                    R$ ", fgts)
print("Total de descontos:            R$ ", totaldescontos)
print("Salário Líquido:               R$ ", salarioliquido)
print("*********************************************")
