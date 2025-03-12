

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





