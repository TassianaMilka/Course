#7-Para um estudo envolvendo o nível de multiplicação de bactérias em uma colônia, foi coletado o número de bactérias por dia (em milhares) 
#e pode ser observado a seguir: [1.2, 2.1, 3.3, 5.0, 7.8, 11.3, 16.6, 25.1, 37.8, 56.9]. Tendo esses valores, faça um código que gere uma 
#lista contendo o percentual de crescimento de bactérias por dia, comparando o número de bactérias em cada dia com o número de bactérias do 
#dia anterior. Dica: para calcular o percentual de crescimento usamos a seguinte equação: 100 * (amostra_atual - amostra_passada) / (amostra_passada).



bacterias_colonia = [1.2, 2.1, 3.3,4.6,3.4];
bacterias_colonia_2=[2.4, 4.5, 2.4,7.8,1.2];

porcentagem_crescimento = []
for i in range(1, len(bacterias_colonia)):
 
  porcentagem = 100 * (bacterias_colonia[i]-bacterias_colonia_2[i]) / (bacterias_colonia[i])
 
  porcentagem_crescimento.append(porcentagem)

print(f'Porcentagens de crescimento:\n{porcentagem_crescimento}')


######


#8-Para uma seleção de produtos alimentícios, precisamos separar o conjunto de IDs dados por números inteiros sabendo que os produtos com ID par são doces e os com ID ímpar são amargos. Monte um código que colete 10 IDs. 
#Depois, calcule e mostre a quantidade de produtos doces e amargos.


ids = []
doce = 0
amargo = 0

for i in range(0,5):

  ids.append(int(input(f'Informe o ID: ')))

for id in ids:

  if id % 2 == 0:

    doce += 1
  else:
    amargo += 1


print(f'Quantidade de produtos doces: {doce}')
print(f'Quantidade de produtos amargos: {amargo}')


######


#9-Desenvolva um programa que informa a nota de um(a) aluno(a) de acordo com suas respostas. Ele deve pedir a resposta desse(a) aluno(a) para cada questão e é preciso verificar se a resposta foi igual ao gabarito. 
#Cada questão vale um ponto e existem as alternativas A, B, C ou D.

respostas = [] 

gabarito = ['D', 'A', 'C', 'B', 'A', 'D', 'C', 'C', 'A', 'B']
soma = 0 


for i in range(0, 10):
  respostas.append(input('Informe a resposta da questão').upper())

for i in range(0,10):
  if respostas[i] == gabarito[i]:

    #Inclementação de quantidade
    soma+= 1

# Exibindo nota final
print(f'Nota final: {soma}')


######


#10-Um instituto de meteorologia deseja fazer um estudo de temperatura média de cada mês do ano. Para isso, você precisa fazer um código que colete e armazene essas temperaturas médias em uma lista. Depois, calcule a média anual das 
#temperaturas e mostre todas as temperaturas acima da média anual e em que mês elas ocorreram, mostrando os meses por extenso (Janeiro, Fevereiro, etc.).



temperaturas_mensais = []
for i in range(0,12):
  temperaturas_mensais.append(float(input(f'Informe a média de temperatura do mês: ')))

meses = ['Janeiro', 'Fevereiro', 'Março', 'Abril', 'Maio', 'Junho', 'Julho', 'Agosto', 'Setembro', 'Outubro', 'Novembro', 'Dezembro']

media_anual = sum(temperaturas_mensais) / len(temperaturas_mensais)


print('Temperaturas acima da média em: ')
for i in range(0,12):
 
  if temperaturas_mensais[i] > media_anual:

    print(meses[i])


######


#11-Uma empresa de e-commerce está interessada em analisar as vendas dos seus produtos. Os dados das vendas foram armazenados em um dicionário:
#Escreva um código que calcule o total de vendas e o produto mais vendido.

dados_vendas = {'Produto A': 300, 'Produto B': 80, 'Produto C': 60, 'Produto D': 200, 'Produto E': 250, 'Produto F': 30}

total_vendas = 0;
produto_mais_vendido = '';
unidades_produto_mais_vendido = 0;

#keys permite a utilização para trabalhar os dados dentro do dicionário

for produto in dados_vendas.keys():

  total_vendas += dados_vendas[produto]
 
  if dados_vendas[produto] > unidades_produto_mais_vendido:
    unidades_produto_mais_vendido = dados_vendas[produto]
    produto_mais_vendido = produto

print(f'Total de vendas é {total_vendas}')
print(f'{produto_mais_vendido} é o mais vendido')



######

#12- Uma pesquisa de mercado foi feita para decidir qual design de marca infantil mais agrada as crianças. A pesquisa foi feita e o votos computados podem ser observados abaixo:
#Adapte os dados fornecidos para uma estrutura de dicionário. A partir dele, informe o design vencedor e a porcentagem de votos recebidos.



votos = {'Design 1': 1334, 'Design 2': 982, 'Design 3': 1751, 'Design 4': 210, 'Design 5': 1811}


total_votos = 0;
vencedor = '';
voto_vencedor = 0;

#items selecionar os votos

for design, voto_desing in votos.items():

  total_votos += voto_desing;
 
  if voto_desing > voto_vencedor:

    voto_vencedor = voto_desing;

    vencedor = design;


porcentagem = 100 * (voto_vencedor) / (total_votos);


print(f'{vencedor} é o vencedor: ')
print(f'Porcentagem de votos: {porcentagem}%')



######

#13-As pessoas colaboradoras de um setor da empresa que você trabalha vão receber um abono correspondente a 10% do salário devido ao ótimo desempenho do time. O setor financeiro solicitou sua ajuda para a verificação das consequências 
#]financeiras que esse abono irá gerar nos recursos. Assim, foi encaminhada para você uma lista com os salários que receberão o abono: [1172, 1644, 2617, 5130, 5532, 6341, 6650, 7238, 7685, 7782, 7903]. O abono de cada colaborador(a)
#não pode ser inferior a 200. Em código, transforme cada um dos salários em chaves de um dicionário e o abono de cada salário no elemento. Depois, informe o total de gastos com o abono, quantos(as) colaboradores(as) receberam o abono 
#mínimo e qual o maior valor de abono fornecido.



salarios = [1172, 1644, 2617, 5130, 5532, 6341, 6650, 7238, 7685, 7782, 7903];

dic_abonos = {} ;
total_abono = 0;
abonos_minimo = 0 ;
maior_abono = 0 ;


for salario in salarios:
  
  abono = salario * 0.1
 
  if abono < 200:
    abono = 200
 
  dic_abonos[salario] = abono

for abono in dic_abonos.values():

  if abono == 200:
    abonos_minimo += 1
 
  if abono > maior_abono:
    maior_abono = abono
 
  total_abono += abono

print(f'Abonos: {dic_abonos}')
print(f'Total de gasto com abonos: {total_abono}')
print(f'Número de funcionários que receberam o abono mínimo: {abonos_minimo}')
print(f'Maior valor de abono: {maior_abono}')


######


#14-Uma equipe de cientistas de dados está estudando a diversidade biológica em uma floresta. A equipe fez a coleta de informações sobre o número de espécies de plantas e animais em cada área dessa floresta e armazenou essas informações
#em um dicionário. Nele, a chave descreve a área dos dados e os valores nas listas correspondem às espécies de plantas e animais nas áreas, respectivamente.
#Escreva um código para calcular a média de espécies por área e identificar a área com a maior diversidade biológica. Dica: use as funções built-in sum() e len().


dados = {'Área Norte': [2819, 7236],
         'Área Leste': [1440, 9492],
         'Área Sul': [5969, 7496],
         'Área Oeste': [14446, 49688],
         'Área Centro': [22558, 45148]};

soma_media = 0; 
maior_diversidade = ''; 
maior_soma = 0 ;

for area, especies in dados.items():

  soma_especies = sum(especies)
  media = soma_especies / len(especies)

  print(f'A {area} tem a média de {media} espécies')
 
  if soma_especies > maior_soma:
      maior_soma = soma_especies
      maior_diversidade = area

  soma_media += media

media_total = soma_media / len(dados)

print(f'Média geral de espécies: {media_total}')
print(f'Área com a maior diversidade biológica: {maior_diversidade}')



######



#15- O setor de RH da sua empresa te pediu uma ajuda para analisar as idades de colaboradores(as) de 4 setores da empresa. Para isso, foram fornecidos os seguintes dados:
#Sabendo que cada setor tem 10 colaboradores(as), construa um código que calcule a média de idade de cada setor, a idade média geral entre todos os setores e quantas pessoas estão 
#acima da idade média geral.



dados = {'Setor A': [22, 26, 30, 30, 35, 38, 40, 56, 57, 65],
        'Setor B': [22, 24, 26, 33, 41, 49, 50, 54, 60, 64],
        'Setor C': [23, 26, 26, 29, 34, 35, 36, 41, 52, 56],
        'Setor D': [19, 20, 25, 27, 34, 39, 42, 44, 50, 65]};

total_idades = 0;

for setor, idades in dados.items():

  media_idade = sum(idades) / len(idades)

  print(f'O {setor} tem a média de {media_idade}')
 
  total_idades += sum(idades)

media_total = total_idades / (len(idades) * len(dados))
print(f'A média de idade geral é {media_total}')


acima_media = 0;

for setor, idades in dados.items():
 
  for id in idades:

    if id > media_total:
    
      acima_media += 1

print(f'{acima_media} pessoas estão acima da idade média geral')





