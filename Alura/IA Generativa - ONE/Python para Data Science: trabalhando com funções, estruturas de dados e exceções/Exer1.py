
#1-Escreva um código para instalar a versão 3.7.1 da biblioteca matplotlib.


!pip install matplotlib==3.7.1




#2-Escreva um código para importar a biblioteca numpy com o alias np.


import numpy as np



#3-Crie um programa que leia a seguinte lista de números e escolha um número desta aleatoriamente.


#random é a biblioteca que gera números e sequências aleatórias.
#choice uma função que deixa o código mais limpo.

from random import choice

lista = [8, 12, 54, 23, 43, 1, 90, 87, 105, 77];
print(lista)
num=int(input('Informe um número da lista:\n'))

print(f'O número selecionado é\n{num}')




#4-Crie um programa que sorteia, aleatoriamente, um número inteiro positivo menor que 100.


from random import randrange
#A função randrange é número inteiro aleatório
randrange(100)



