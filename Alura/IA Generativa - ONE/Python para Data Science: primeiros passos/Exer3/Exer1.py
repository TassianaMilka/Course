

#1-Escreva um programa que peça à pessoa usuária para fornecer dois números e exibir o número maior.

nump=int(input('Informe o primeiro número'))
nums=int(input('Informe o segundo número'))


if nump>nums:

  print(f'O número maior é={nump}')

elif nums>nump:

  print(f'O número maior é={nums}')
  

######


#2-Escreva um programa que solicite o percentual de crescimento de produção de uma empresa e informe se houve um crescimento (porcentagem positiva) ou decrescimento (porcentagem negativa).

num=float(input('Informe o percentual de crescimento de produção'))



if num>0:

  print(f'Conteve crescimento positivo na porcentagem:{num}')

elif num<0:

  print(f'Contém crescimento negativo na porcentagem:{num}')
  

######


#3-Escreva um programa que determine se uma letra fornecida pela pessoa usuária é uma vogal ou consoante.


letra = input('Informe uma letra: ').lower()
letras_vogais = 'aeiou'

if letra in letras_vogais:
    print('A letra é uma vogal.')
else:
    print('A letra é uma consoante.')


######



#4-Escreva um programa que leia valores médios de preços de um modelo de carro por 3 anos consecutivos e exiba o valor mais alto e mais baixo entre esses três anos.



preco_ano1 = float(input("Digite o preço médio do carro no ano 1: "))
preco_ano2 = float(input("Digite o preço médio do carro no ano 2: "))
preco_ano3 = float(input("Digite o preço médio do carro no ano 3: "))


preco_mais_alto = preco_ano1
preco_mais_baixo = preco_ano1


if preco_ano2 > preco_mais_alto:
    preco_mais_alto = preco_ano2
elif preco_ano2 < preco_mais_baixo:
    preco_mais_baixo = preco_ano2


if preco_ano3 > preco_mais_alto:
    preco_mais_alto = preco_ano3
elif preco_ano3 < preco_mais_baixo:
    preco_mais_baixo = preco_ano3


print("O preço mais alto do carro nos três anos foi:", preco_mais_alto)
print("O preço mais baixo do carro nos três anos foi:", preco_mais_baixo)


#####


#5-Escreva um programa que pergunte sobre o preço de três produtos e indique qual é o produto mais barato para comprar.

preco_produto_p = float(input("Informe o preço do produto 1: "))
preco_produto_s = float(input("Informe o preço do produto 2: "))
preco_produto_t = float(input("Informe o preço do produto 3: "))



preco_mais_baixo = preco_produto_p



if preco_produto_s < preco_mais_baixo:
    preco_mais_baixo = preco_produto_s


if preco_produto_t < preco_mais_baixo:
    preco_mais_baixo = preco_produto_t


print("O preço mais baixo dos três produtos:", preco_mais_baixo)

#####


#6-Escreva um programa que leia três números e os exiba em ordem decrescente.


num1 = float(input("Informe o primeiro número: "))
num2 = float(input("Informe o segundo número: "))
num3 = float(input("Informe o terceiro número: "))


if num1 >= num2 and num1 >= num3:
    maior = num1
    if num2 >= num3:
        meio = num2
        menor = num3
    else:
        meio = num3
        menor = num2
elif num2 >= num1 and num2 >= num3:
    maior = num2
    if num1 >= num3:
        meio = num1
        menor = num3
    else:
        meio = num3
        menor = num1
else:
    maior = num3
    if num1 >= num2:
        meio = num1
        menor = num2
    else:
        meio = num2
        menor = num1


print("Números em ordem decrescente:", maior, meio, menor)


#####


#7-Escreva um programa que pergunte em qual turno a pessoa usuária estuda ("manhã", "tarde" ou "noite") e exiba a mensagem "Bom Dia!", "Boa Tarde!", "Boa Noite!", ou "Valor Inválido!", conforme o caso.


escolha =input('Informe em que horário você estuda?:')


if escolha=="manhã":


  print('Bom dia!')


elif escolha=="tarde":


 print('Bom tarde!')


elif escolha=="noite":

 print('Bom noite!')


else:

  print('Tenta novamente!')


#####


#8-Escreva um programa que peça um número inteiro à pessoa usuária e determine se ele é par ou ímpar. Dica: Você pode utilizar o operador módulo %.


num=int(input('Informe o número:'))


if num%2==0:

   print('O número é par!')

else:

  print('O número é impar!')


#####



#9-Escreva um programa que peça um número à pessoa usuária e informe se ele é inteiro ou decimal.



#9-Escreva um programa que peça um número à pessoa usuária e informe se ele é inteiro ou decimal.

num=float(input('Informe o número:'))


if num%1==0:

   print('O número é do tipo inteiro!')

else:

  print('O número é do tipo decimal!')



