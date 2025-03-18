
#6-Um programa deve ser escrito para sortear uma pessoa seguidora de uma rede social para ganhar um prêmio. A lista de participantes é numerada e devemos escolher aleatoriamente um número de acordo com a quantidade de participantes. 
#Peça à pessoa usuária para fornecer o número de participantes do sorteio e devolva para ela o número sorteado.



from random import randint


num = int(input("Informe o número de participantes do sorteio: "))

print(f"O número sorteado foi {randint(6,num)}")


######


#Você recebeu uma demanda para gerar números de token para acessar o aplicativo de uma empresa. O token precisa ser par e variar de 1000 até 9998. Escreva um código que solicita à pessoa usuária o seu nome e exibe uma mensagem junto a
#esse token gerado aleatoriamente.

from random import randrange

nome = input("Informe o seu nome: ")

token = randrange(1000, 10000, 2)

print(f"Olá, {nome}, o seu token de acesso é {token}! Seja bem-vindo(a)!")


######


#8-Para diversificar e atrair novos(as) clientes, uma lanchonete criou um item misterioso em seu cardápio chamado "salada de frutas surpresa". Neste item, são escolhidas aleatoriamente 3 frutas de uma lista de 12 para compor a salada de 
#frutas da pessoa cliente.


from random import choices

frutas = ["maçã", "banana", "uva", "pêra", 
          "manga", "coco", "melancia", "mamão",
          "laranja", "abacaxi", "kiwi", "ameixa"];



salada = choices(frutas, k=3)

print(f"A salada surpresa é: {salada[0]}, {salada[1]} e {salada[2]}")



######


#9-Você recebeu um desafio de calcular a raiz quadrada de uma lista de números, identificando quais resultaram em um número inteiro.


from math import pi, pow

raio = float(input("Informe o raio da área circular em metros: "))

area = pi*pow(raio,2)
valor = area * 25.00

print(f"Você precisará pagar R$ {round(valor,2)} por uma área de {round(area,2)} metros de grama")


######
