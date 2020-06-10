print("**************FIBONACCI**************")

n = int(input("Informe a posição do último termo a ser mostrado: "))
x = 1
ant1=x
ant2=x
if(n == 1):
    print(x)
if(n == 2):
    print(x)
    print(x)
else:
    print(x)
    print(x)
    for cont in range (n):
        x = ant1 + ant2
        print(x)
        ant2 = ant1
        ant1 = x

        cont = cont +1