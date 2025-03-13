
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



