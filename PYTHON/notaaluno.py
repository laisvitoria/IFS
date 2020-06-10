print("********************CALCULAR MÉDIA********************")
print(" ")
print("******************INSIRA SUAS NOTAS*******************")
nota1 = float(input("Primeira nota: "))
nota2 = float(input("Segunda nota: "))

while(nota1 > 10 or nota2 > 10):
    print(" ")
    print("Existe nota inválida. O máximo é : 10")
    print("*****Insira novamente suas notas*****")
    nota1 = float(input("Primeira nota: "))
    nota2 = float(input("Segunda nota: "))

media = (nota1 + nota2)/2.0

if(media < 7):
    print("REPROVADO - Sua média é ", media)

if(media >= 7):
    if(media == 10):
        print("APROVADO COM DISTINÇÂO - Parabéns! Sua média é ", media)
    else:
        print("APROVADO - Sua média é ", media)