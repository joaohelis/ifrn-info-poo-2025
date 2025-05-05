# # -----------------------------------------------
# # Exercício 3 - Calculadora
# # -----------------------------------------------
#
# # Faça um programa que simule uma calculadora simples. O usuário deve escolher a operação desejada (adição, subtração, multiplicação ou divisão) e informar os dois números. O programa deve exibir o resultado da operação.
#
# # Exemplo de saída:
# # Escolha uma operação:
# # 1. Adição
# # 2. Subtração
# # 3. Multiplicação
# # 4. Divisão
# # 5. Sair
# # Digite o número da operação desejada: 1
# # Digite o primeiro número: 10
# # Digite o segundo número: 5
# # Resultado da adição: 15
# # -----------------------------------------------

continuar = True

while(continuar):
    print("==================================")
    print("Calculadora em Python")
    print("==================================")

    print("Escolha uma operação:")
    print("1. Adição")
    print("2. Subtração")
    print("3. Multiplicação")
    print("4. Divisão")
    print("5. Sair")

    operacao = int(input("Digite o número da operação desejada: "))
    if(operacao == 5):
        continuar = False
        print("Saindo da calculadora...")
        break
    elif(operacao >= 1 and operacao <= 5):
        num1 = float(input("Digite o primeiro número: "))
        num2 = float(input("Digite o segundo número: "))

        if(operacao == 1):
            resultado = num1 + num2
            print("Resultado da adição: ", resultado)
        elif(operacao == 2):
            resultado = num1 - num2
            print("Resultado da subtração: ", resultado)
        elif(operacao == 3):
            resultado = num1 * num2
            print("Resultado da multiplicação: ", resultado)
        elif(operacao == 4):
            if(num2 != 0):
                resultado = num1 / num2
                print("Resultado da divisão: ", resultado)
            else:
                print("Erro! Divisão por zero não é permitida.")
    else:
        print("Operação inválida! Tente novamente.")
    print("==================================")
    print("Deseja realizar outra operação? (s/n)")
    continuar = input().lower() == "s"
print("Obrigado por usar a calculadora!")