
#1-Faça um programa que tenha a seguinte lista contendo os valores de gastos de uma empresa de papel [2172.54, 3701.35, 3518.09, 3456.61, 3249.38, 2840.82, 3891.45, 3075.26, 2317.64, 3219.08]. Com esses valores, 
#faça um programa que calcule a média de gastos. Dica: use as funções built-in sum() e len().


valor=[2172.54, 3701.35, 3518.09, 3456.61, 3249.38, 2840.82, 3891.45, 3075.26, 2317.64, 3219.08];


len(valor)



######


valor=[2172.54, 3701.35, 3518.09, 3456.61, 3249.38, 2840.82, 3891.45, 3075.26, 2317.64, 3219.08];


sum(valor)



######


#2-Com os mesmos dados da questão anterior, defina quantas compras foram realizadas acima de 3000 reais e calcule a porcentagem quanto ao total de compras.


 valor = [2172.54, 3701.35, 3518.09, 3456.61, 3249.38, 2840.82, 3891.45, 3075.26, 2317.64, 3219.08]


compras_acima_3000 = [v for v in valor if v > 3000]
quantidade_acima_3000 = len(compras_acima_3000)


porcentagem = (quantidade_acima_3000 / len(valor)) * 100


print(f"A quantidade de compras acima de 3000 reais é: {quantidade_acima_3000}")
print(f"A porcentagem de compras acima de 3000 reais é: {porcentagem:.2f}%")



######


#3-Faça um código que colete em uma lista 5 números inteiros quaisquer e imprima a lista. Exemplo: [1,4,7,2,4].

numeros=[1,4,7,2,4];

print(numeros)



######

#4-Colete novamente 5 inteiros e imprima a lista em ordem inversa à enviada.


numeros=[4,2,7,4,1];

print(numeros)

######


#5-Faça um programa que, ao inserir um número qualquer, cria uma lista contendo todos os números primos entre 1 e o número digitado.


numero=int(input('Informe um número primo\n'))


print(f'O número informado\n{numero}')

numeros_primos=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199];
  
  
  
print(f'Lista de número primos até 199\n{numeros_primos}')


######


#6-Escreva um programa que peça uma data informando o dia, mês e ano e determine se ela é válida para uma análise.

data=["14/09/2000"];

escolher=int(input('Informe se deseja visualizar a data informada para 1-[sim]ou 2-[finalização]\n]'))

if  escolher==1:

  print('Data válida para uma análise!')
  print(data)

else:

  print('Finalização!')



