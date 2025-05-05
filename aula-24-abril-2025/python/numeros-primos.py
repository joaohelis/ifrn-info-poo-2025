# Exercício 2 - Números Primos

print("==================================")
print("Números Primos")
print("==================================")

numero = int(input("Digite um número: "))

if(numero < 2):
    print("O número não é primo!")
else:
    primo = True
    for i in range(2, numero):
        if(numero % i == 0):
            primo = False
            break
    if(primo):
        print("O número é primo!")
    else:
        print("O número não é primo!")