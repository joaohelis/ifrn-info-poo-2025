# -----------------------------------------------
# Exercício 3 - Maior Nota
# -----------------------------------------------

# Faça um programa que leia o nome e a nota de 5 alunos. No final, mostre o nome do aluno com a maior nota.

maior_nota = 0
aluno = ""
contador = 1
while(contador <= 5):
    nome = input("Digite o seu nome aqui: ")
    nota = float(input("Digite a sua nota aqui: "))
    
    if(nota > maior_nota):
        maior_nota = nota
        aluno = nome
    
    contador += 1

print("A maior nota é: ", maior_nota)
print("O aluno com a maior nota foi: ", aluno)