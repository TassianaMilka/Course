#1-Escreva um código que lê a lista abaixo e faça:



#A leitura do tamanho da lista
#A leitura do maior e menor valor
#A soma dos valores da lista


lista = [16, 14, 63, 65, 17, 99, 70, 11, 20, 48, 79, 32, 17, 89, 12, 25, 66]

tam = len(lista)
maior = max(lista)
menor = min(lista)
soma = sum(lista)


print(f"A lista possui {tam} números em que o maior número é {maior} e o menor número é {menor}. A soma dos valores {soma}.")



######


#2-Escreva uma função que gere a tabuada de um número inteiro de 1 a 10, de acordo com a escolha da pessoa usuária. Como exemplo, para o número 7, a 
#tabuada deve ser mostrada no seguinte formato:


num = int(input("Informe um número inteiro de 1 a 10:"))

#função def 
def tabuada(num: int):
  print(f'Tabuada do {num}:')
  for i in range(11):
    resultado = num * i
    print(f'{num} x {i} = {resultado}')
tabuada(num)


######


#3-Crie a função que leia a lista abaixo e retorne uma nova lista com os múltiplos de 3:

num = [97, 80, 94, 88, 80, 1, 16, 53, 62, 32, 24, 99];

def tabuada(numeros: list):
    for num in numeros:
        print(f'Tabuada do {num}:')
        for i in range(11):
            resultado = num * i
            print(f'{num} x {i} = {resultado}')
        print('\n')  

tabuada(num)



######


#4-Crie uma lista dos quadrados dos números da seguinte lista [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Lembre-se de utilizar as funções lambda e map() para calcular o quadrado de cada elemento da lista.


numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

quadrado = lambda x: x ** 2

resultado = list(map(quadrado, numeros))

#Imprimir o resultado da lista de multiplicação

list(resultado)


######
