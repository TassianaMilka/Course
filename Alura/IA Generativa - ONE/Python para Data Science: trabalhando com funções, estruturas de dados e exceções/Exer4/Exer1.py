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
  

idades = {'Júlia': 16, 'Carol': 23, 'Alberto': 19, 'Roberta': 17}

try:
    chave = input('Informe o nome\n')
    valor = idades[chave]
except KeyError:
    print('Nome não encontrado')
else:
    print(valor)
    
  
  ######

#3- Crie uma função que recebe uma lista como parâmetro e converta todos os valores da lista para float. A função deve conter um tratamento de erro indicando o tipo de erro gerado e retornar a lista caso não tenha ocorrido nenhum erro. 
#Por fim, deve ter a cláusula finally para imprimir o texto: 'Fim da execução da função'.

def converter_para_float(lista):
    try:
        lista_convertida = [float(item) for item in lista]
        return lista_convertida
    except ValueError as e:
        print(f"Erro de conversão: {e}")
    except TypeError as e:
        print(f"Erro de tipo: {e}")
        return lista  
    finally:
        print("Fim da execução da função")


dados = ["3.5", "7", "abc", 10]
resultado = converter_para_float(dados)
print(resultado)



  ######



#4-Crie uma função que recebe duas listas como parâmetros e agrupe os elementos um a um das listas, formando uma lista de tuplas de 3 elementos, no qual o primeiro e segundo elemento da tupla são os valores na posição i das listas e o terceiro 
#elemento é a soma dos valores na posição i das listas.

def agrupar_listas(lista1, lista2):
    try:
        lista_agrupada = [(lista1[i], lista2[i], lista1[i] + lista2[i]) for i in range(min(len(lista1), len(lista2)))]
        return lista_agrupada
    except TypeError as e:
        print(f"Erro de tipo: {e}")
    finally:
        print("Fim da execução da função")

lista_a = [1, 2, 3, 4]
lista_b = [10, 20, 30, 40]
resultado = agrupar_listas(lista_a, lista_b)
print(resultado)
   

  ######
