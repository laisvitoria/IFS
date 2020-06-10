print("**************NOTAS DOS ATLETAS**************")
nomeatleta = input("Informe o nome do atleta: ")
cont = 0

nota = float(input("Nota: "))
piornota = nota
melhornota = nota
somanota = nota

while cont < 6 :
    nota = float(input("Nota: "))
    if(nota < piornota):
        piornota = nota
    if(nota > melhornota):
        melhornota = nota

    somanota = somanota + nota
    cont = cont+1

somamedia = somanota - (piornota + melhornota)
media = somamedia//5

print(" ")
print("Resultado final: ")
print("Atleta: ", nomeatleta)
print("Melhor nota: ", melhornota)
print("Pior nota: ", piornota)
print("Média: ", media)