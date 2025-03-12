

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











