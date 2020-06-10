print("**********************BAIXAR ARQUIVO**********************")
tamanhoarquivo = int(input("Qual o tamanho do aquivo que você deseja baixar? (em MB)"))
velocidadelink = int(input("Qual a velocidade do link de internet que você irá usar? (em Mbps)"))

temposegundos = tamanhoarquivo//velocidadelink
tempominutos = temposegundos/60

print(" ")
print("Você precisará de aproximadamente ", tempominutos, " minutos para baixar o arquivo")
