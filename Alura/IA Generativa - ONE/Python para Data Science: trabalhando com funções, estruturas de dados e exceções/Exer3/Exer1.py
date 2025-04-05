#1-Crie um código para imprimir a soma dos elementos de cada uma das listas contidas na seguinte lista:


lista_de_listas = [[4,6,5,9], [1,0,7,2], [3,4,1,8]];

for lista in lista_de_listas:
    print(sum(lista))



######


#2-Crie um código para gerar uma lista que armazena o terceiro elemento de cada tupla contida na seguinte lista de tuplas:

lista_de_tuplas = [('Pedro', 1.74, 81), ('Júlia', 1.65, 67), ('Otávio', 1.81, 83)];
lista=[];

for tupla in lista_de_tuplas:
       lista.append(tupla[2])
print(lista)


######


#3-A partir da lista: lista = ['Pedro', 'Júlia', 'Otávio', 'Eduardo'], crie um código para gerar uma lista de tuplas em que cada tupla tenha o primeiro 
#elemento como a posição do nome na lista original e o segundo elemento sendo o próprio nome.


lista_de_tuplas = ['Pedro', 'Júlia', 'Otávio', 'Eduardo'];
for i in range(len(lista)):
    lista_de_tuplas.append((i, lista[i]))
print(lista_de_tuplas)


######



#4-Crie uma lista usando o list comprehension que armazena somente o valor numérico de cada tupla caso o primeiro elemento seja 'Apartamento', a partir da seguinte 
#lista de tuplas:


 aluguel = [('Apartamento', 1700), ('Apartamento', 1400), ('Casa', 2150), ('Apartamento', 1900), ('Casa', 1100)];



valores_apartamentos = [valor for tipo, valor in aluguel if tipo == "Apartamento"]

print(valores_apartamentos)


######


#5-Crie um dicionário usando o dict comprehension em que as chaves estão na lista meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'] 
#e os valores estão em despesa = [860, 490, 1010, 780, 900, 630, 590, 770, 620, 560, 840, 360].


meses = ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago', 'Set', 'Out', 'Nov', 'Dez'];
despesa = [860, 490, 1010, 780, 900, 630, 590, 770, 620, 560, 840, 360];

despesas_mensais = {mes: valor for mes, valor in zip(meses, despesa)}

print(despesas_mensais)


######
