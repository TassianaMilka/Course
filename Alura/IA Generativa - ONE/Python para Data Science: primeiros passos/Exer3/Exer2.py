

#10-Um programa deve ser escrito para ler dois números e, em seguida, perguntar à pessoa usuária qual operação ele deseja realizar. O resultado da operação deve incluir informações sobre o número - 
#se é par ou ímpar, positivo ou negativo e inteiro ou decimal.


num1=int(input('Informe o primeiro número:'))
num2=int(input('Informe o segundo número:'))
operador=int(input('Informe o operador que deseja realizar um cálculo 1-[+(soma)],2-[-(Subtração)],3-[*(multiplicação)] e 4-[/(divisão)]:'))


if operador==1:

 cal=num1+num2;

 print(f'O resultado da soma:{cal}')

elif operador==2:

  cal=num1-num2;

  print(f'O resultado da subtração:{cal}')

elif operador==3:

  cal=num1*num2;

  print(f'O resultado da multiplicação:{cal}')


elif operador==4:

  cal=num1/num2;

  print(f'O resultado da divisão:{cal}')

else:

   print('Tente novamente!')

if cal % 1 == 0:

    print('O resultado é inteiro!')

else:

    print('O resultado é decimal!')

if cal > 0:

    print('O resultado é positivo!')

elif cal == 0:

    print('O resultado é neutro!')

else:

    print('O resultado é negativo!')

if cal % 2 == 0:

    print('O resultado é par!')

else:
  
    print('O resultado é ímpar!')


######


#11-Escreva um programa que peça à pessoa usuária três números que representam os lados de um triângulo. O programa deve informar se os valores podem ser utilizados para formar um triângulo e, caso afirmativo, se ele é equilátero, isósceles ou escaleno. Tenha em mente algumas dicas:

#Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
#Triângulo Equilátero: três lados iguais;
#Triângulo Isósceles: quaisquer dois lados iguais;
#Triângulo Escaleno: três lados diferentes.




print('Coletaremos os lados de um triângulo.')
lado1 = float(input('Digite o comprimento do primeiro lado: '))
lado2 = float(input('Digite o comprimento do segundo lado: '))
lado3 = float(input('Digite o comprimento do terceiro lado: '))

if (lado1 + lado2 > lado3) and (lado2 + lado3 > lado1) and (lado1 + lado3 > lado2):
    print('Os valores podem formar um triângulo!')
    if (lado1 == lado2) and (lado2 == lado3):
        print('O triângulo é equilátero.')
    elif (lado1 != lado2) and (lado2 != lado3) and (lado1 != lado3):
        print('O triângulo é escaleno.')
    else:
        print('O triângulo é isósceles.')
else:
    print('Os valores não podem formar um triângulo!')


######


#12-Um estabelecimento está vendendo combustíveis com descontos variados. Para o etanol, se a quantidade comprada for até 15 litros, o desconto será de 2% por litro. Caso contrário, será de 4% por litro. Para o diesel, se a quantidade comprada for até 15 litros, o desconto será de 3% por litro. Caso contrário, será de 5% por litro. O preço do litro de diesel é R$ 2,00 e o preço do litro de etanol é R$ 1,70. Escreva um programa que leia a quantidade de litros vendidos e o tipo de combustível (E para etanol e D para diesel) e calcule o valor a ser pago pelo cliente. Tenha em mente algumas dicas:

#O do valor do desconto será a multiplicação entre preço do litro, quantidade de litros e o valor do desconto.
#O valor a ser pago por um cliente será o resultado da multiplicação do preço do litro pela quantidade de litros menos o valor de desconto resultante do cálculo.




