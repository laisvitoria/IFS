print("**************FATORIAL**************")
numero = int(input("Informe um número: "))
fatorial = numero

print(" ")
print("Fatorial de: ", numero)
if( numero == 0):
    print(1, " = ",numero,"!" )
else:
    for cont in range(fatorial-1):
        fatorial= fatorial*(cont+1)
        print((cont+1),".")
    print(numero, " = ", fatorial, " = ",numero,"!" )