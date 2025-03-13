
#1-Escreva um programa que peça dois números inteiros e imprima todos os números inteiros entre eles.


for contador in range(0,2):

  num=int(input('Informe o número'))

  print(num)



#2-Escreva um programa para calcular quantos dias levará para a colônia de uma bactéria A ultrapassar ou igualar
#a colônia de uma bactéria B, com base nas taxas de crescimento de 3% e 1,5% respectivamente. Considere que a colônia 
#A inicia com 4 elementos e a B com 10.

colonia_a = 4
colonia_b = 10


dias = 0


while colonia_a <= colonia_b:

  colonia_a=colonia_a * 1 + 0.03
  colonia_b=colonia_b* 1 + 0.015

  dias += 1


print(f'Irá levar {dias} dias para a colônia A ultrapassar a colônia B.')



######


#3-Para tratar uma quantidade de 15 dados de avaliações de pessoas usuárias de um serviço da empresa, precisamos verificar se as notas são válidas. 
#Então, escreva um programa que vai receber a nota de 0 a 5 de todos os dados e verificar se é um valor válido. Caso seja inserido uma nota acima de 
#5 ou abaixo de 0, repita até que a pessoa usuária insira um valor válido.


for i in range(5):
  nota = float(input(f'Informe a nota:'))

  
if (nota < 0) or (nota > 5):
    nota = float(input(f'Insira novamente a nota:'))

print('Todas as notas são válidas!')



######


#4-Desenvolva um programa que leia um conjunto indeterminado de temperaturas em Celsius e informe a média delas. A leitura deve ser encerrada ao ser enviado o valor -273°C.


temperatura = float(input('Informe a temperatura em Celsius: '))


contadora = 0
soma = 0


while temperatura != -273:

    soma += temperatura

    contadora += 1
  
    temperatura = float(input('Iforme a temperatura em Celsius: '))

    media = soma / contadora


######



#5-Escreva um programa que calcule o fatorial de um número inteiro fornecido pela pessoa usuária. Lembrando que o fatorial de um número inteiro é a 
#multiplicação desse número por todos os seus antecessores até o número 1. Por exemplo, o fatorial de 5 é 5 x 4 x 3 x 2 x 1 = 120.


for num in range(0,1):



   multi=5*4*3*2*1


   print(f'O resultado do fatorial em sequência:{multi}')


######




