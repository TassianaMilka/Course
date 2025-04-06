#1-Faça um programa que solicite à pessoa usuária digitar dois números float e calcular a divisão entre esses números. 
#O código deve conter um tratamento de erro, indicando o tipo de erro que foi gerado caso a divisão não seja possível de realizar.

try:
    numero_1 = float(input('Informe o primeiro número'))
    numero_2 = float(input('Informe o segundo número'))
    divisao = numero_1 / numero_2
    print(divisao)
except Exception as e:
    print(type(e), f'Erro: {e}')


######

#2-Faça um programa que solicite à pessoa usuária digitar um texto que será uma chave a ser pesquisada no seguinte dicionário: idades = {'Júlia': 16, 'Carol': 23, 'Alberto': 19, 'Roberta': 17}, 
  #armazenando o resultado do valor em uma variável. O código deve conter um tratamento de erro KeyError, imprimindo a informação 'Nome não encontrado', caso ocorra o erro; e imprimir o valor caso não ocorra nenhum
  
  
  
  ######
