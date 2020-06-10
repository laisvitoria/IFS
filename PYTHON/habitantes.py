print("**************POPULAÇÃO DOS PAÍSES A E B**************")
Ahab = 80000
Bhab = 200000
anos = 0

while(Ahab < Bhab):
    Ahab = (Ahab + (3/100) * Ahab)
    Bhab = (Bhab + (1.5/100) * Bhab)
    anos = anos+1

print("")
print("É necessário ",anos, " anos para a população de A se maior que a de B.")
print("A população de A será: ", Ahab, " habitantes")
print("E a população de B será: ", Bhab, " habitantes")
