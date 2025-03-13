

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






              



              
              
