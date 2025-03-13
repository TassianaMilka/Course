

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



              
