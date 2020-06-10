print("********************CAIXA ELETRÔNICO********************")
print("As notas disponíveis são: 1, 5, 10, 50 e 100 reais")
print(" ")
print("*************************SAQUE**************************")

print("Valor minímo : 10,00 reais")
print("Valor máximo: 600,00 reais")
print(" ")
valorsaque = int(input("Informe o valor do saque: "))

while( valorsaque < 10):
    print(" ")
    print("Valor minímo para saque é 10,00 reais")
    valorsaque = int(input("Informe novamente o valor do saque: "))
while(valorsaque > 600):
    print(" ")
    print("O valor máximo para saque é 600,00 reais")
    valorsaque = int(input("Informe novamente o valor do saque: "))

notascem = int(valorsaque/100)
notascinquenta = int((valorsaque - notascem*100) / 50)
notasdez = int((valorsaque - notascem*100 - notascinquenta*50) / 10)
notascinco = int((valorsaque - notascem*100 - notascinquenta*50 - notasdez*10) / 5)
notasum = int(valorsaque - notascem*100 - notascinquenta*50 - notasdez*10 - notascinco*5)

print(" ")
print("Você irá receber:")
print(notascem, " notas de 100 reais")
print(notascinquenta, " notas de 50 reais")
print(notasdez, " notas de 10 reais")
print(notascinco, " notas de 5 reais")
print(notasum, " notas de 1 real")

