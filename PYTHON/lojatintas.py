metrosquadrados = float(input("Quantos metros quadrados serão pintados? "))

litrosnecessarios = metrosquadrados // 6


if (litrosnecessarios % 3.6 != 0):
    galoesnecessarios = int(litrosnecessarios/3.6) + 1
else:
     galoesnecessarios = int(litrosnecessarios/3.6)

if (litrosnecessarios % 18 != 0):
    latasnecessarias = int(litrosnecessarios/18) +1
else:
     latasnecessarias = int(litrosnecessarios/18)
     

if (metrosquadrados > 64.8):
    latas = int(litrosnecessarios//18)
    galao = 0
    if (latas == 0):
        latas = 1
    resto = litrosnecessarios - (latas * 18)
    galoesamais = resto//3.6

    if (galoesamais != 0):
        if (galoesamais <= 1):
            galao = 1
        if (galoesamais > 1 and galoesamais <= 2):
            galao = 2
        if (galoesamais > 2 and galoesamais <= 3):
            galao = 3
        if (galoesamais > 3):
            latas = latas + 1      
    custogalao = galao * 25
    custolatas = latas * 80
    acressimo = 0
    if(galao != 0):
        acressimo = (custogalao + custolatas) * 0.1
    total = custogalao + custolatas + acressimo
    
precogaloes = galoesnecessarios * 25
precolatas = latasnecessarias * 80


print(" ")
print("********************** Opções possíveis **********************")
print("Você precisará de ", litrosnecessarios, " litros de tinta.")
print("Podendo ser")
print("Apenas Galões     : ", galoesnecessarios, "            | R$: ", precogaloes)
print("Apenas Latas      : ", latasnecessarias, "             | R$: ", precolatas)
if (metrosquadrados > 64.8):
    print("Ou Galões e latas : ", galao, "      galões | R$: ", custogalao)
    print("                    ", latas, "      latas  | R$: ", custolatas)
    print("Acressímo                           = R$: ", acressimo)
    print("Total                               = R$: ", total)

