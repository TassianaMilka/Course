

#6-Escreva um programa que gere a tabuada de um número inteiro de 1 a 10, de acordo com a escolha da pessoa usuária. Como exemplo, para o número 2, a tabuada.

num = int(input('Informe um número inteiro de 1 a 10: '))

for i in range(1, 11):
    resultado = num * i
    print(f'{num} x {i} = {resultado}')


######


#7-Os números primos possuem várias aplicações dentro da Ciência de Dados em criptografia e segurança, por exemplo. Um número primo é aquele que é divisível apenas por um e por ele mesmo. 
#Assim, faça um programa que peça um número inteiro e determine se ele é ou não um número primo.


num = int(input('Informe um número: '))

if num <= 1:
    print('\n')
else:
    primo = True 
    for i in range(2, num):
        if num % i == 0:
            primo = False  
            break

    if primo:
        print('O número é primo!')
    else:
        print('O número não é primo


              

######


#8-Vamos entender a distribuição de idades de pensionistas de uma empresa de previdência. Escreva um programa que leia as idades de uma quantidade não informada de clientes e mostre a distribuição em intervalos de [0-25], 
#[26-50], [51-75] e [76-100]. Encerre a entrada de dados com um número negativo.





idade = int(input('Informe a idade (ou um número negativo para encerrar): '))

contador_0_25 = 0 
contador_26_50 = 0 
contador_51_75 = 0 
contador_76_100 = 0 

while idade >= 0:

    if idade >= 0 and idade <= 25:
        contador_0_25 += 1
    elif idade >= 26 and idade <= 50:
        contador_26_50 += 1
    elif idade >= 51 and idade <= 75:
        contador_51_75 += 1
    elif idade >= 76 and idade <= 100:
        contador_76_100 += 1
    
    idade = int(input('Informe a idade (ou um número negativo para encerrar): '))

print('Distribuição de idades:')
print('[0-25]:', contador_0_25)
print('[26-50]:', contador_26_50)
print('[51-75]:', contador_51_75)
print('[76-100]:', contador_76_100)





              
######


#Em uma eleição para gerência em uma empresa com 20 pessoas colaboradoras, existem quatro candidatos(as). Escreva um programa que calcule o(a) vencedor(a) da eleição. A votação ocorreu da seguinte maneira:

#Cada colaborador(a) votou em uma das quatro pessoas candidatas (que representamos pelos números 1, 2, 3 e 4).
#Também foram contabilizados os votos nulos (representados pelo número 5) e os votos em branco (representados pelo número 6).



votos_candidato1 = 0
votos_candidato2 = 0
votos_candidato3 = 0
votos_candidato4 = 0
votos_nulos = 0
votos_branco = 0


for i in range(0,5):
    voto = int(input('Informe seu voto: '))
    if voto == 1:
        votos_candidato1 += 1
    elif voto == 2:
        votos_candidato2 += 1
    elif voto == 3:
        votos_candidato3 += 1
    elif voto == 4:
        votos_candidato4 += 1
    elif voto == 5:
        votos_nulos += 1
    elif voto == 6:
        votos_branco += 1
    else:
        print("Voto inválido.")

print(f'Votos candidato 1: {votos_candidato1}')
print(f'Votos candidato 2: {votos_candidato2}')
print(f'Votos candidato 3: {votos_candidato3}')
print(f'Votos candidato 4: {votos_candidato4}')
print(f'Votos nulos: {votos_nulos}')
print(f'Votos em branco: {votos_branco}')
print(f'Percentual de votos nulos: {(votos_nulos / 20 * 100)}')
print(f'Percentual de votos em branco: {(votos_branco / 20 * 100)}')              
              
