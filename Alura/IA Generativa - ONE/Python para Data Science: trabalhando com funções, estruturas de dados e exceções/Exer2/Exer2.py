#5-Você foi contratado(a) como cientista de dados de uma associação de skate.
#Para analisar as notas recebidas de skatistas em algumas competições ao longo do ano,
#você precisa criar um código que calcula a pontuação dos(as) atletas. 
#Para isso, o seu código deve receber 5 notas digitadas pelas pessoas juradas.


notas = []

for i in range(1,6):
  nota = float(input(f"Informe a {i}ª nota: "))
  notas.append(nota)

def media(lista):
  lista.remove(max(lista))
  lista.remove(min(lista))
  return sum(lista) / len(lista)

media = media(notas)
print(f"Nota da manobra: {round(media, 1)}") 


######


#6-Para atender a uma demanda de uma instituição de ensino para a análise do desempenho de seus(suas) estudantes, você precisa criar uma função que receba uma lista de 4 notas e retorne:

#maior nota
#menor nota
#média
#situação (Aprovado(a) ou Reprovado(a))
#Para testar o comportamento da função, os dados podem ser exibidos em um texto:



notas = []

for i in range(1,5):
  nota = float(input(f"Digite a {i}ª nota: "))
  notas.append(nota)

def cadastro(lista):
  maior = max(lista)
  menor = min(lista)
  media = sum(lista) / len(lista)
  if media >= 6:
    situacao = "Aprovado(a)"
  else:
    situacao = "Reprovado(a)"
  
  return (media, maior, menor, situacao)

media, maior, menor, situacao = cadastro(notas)

print(f"O(a) estudante obteve uma media de {media}, com a sua maior nota de {maior} pontos e a menor nota de {menor} pontos e foi {situacao}")



######


#7-Você recebeu uma demanda para tratar 2 listas com os nomes e sobrenomes de cada estudante concatenando-as para apresentar seus nomes completos na forma 
#Nome Sobrenome. 


nomes = ["joão", "MaRia", "JOSÉ"]
sobrenomes = ["SILVA", "souza", "Tavares"]

nome_completo = map(lambda nome, sobrenome: f'{nome.title()} {sobrenome.title()}', nomes, sobrenomes)


for n in nome_completo:
  print(f'Nome completo: {n}')


######


#8-Como cientista de dados em um time de futebol, você precisa implementar novas formas de coleta de dados sobre o desempenho de jogadores e do time como um todo. 
#Sua primeira ação é criar uma forma de calcular a pontuação do time no campeonato nacional a partir dos dados de gols marcados e sofridos em cada jogo.


gols_marcados = [2, 1, 3, 1, 0]
gols_sofridos = [1, 2, 2, 1, 3]

def calcula_pontos(gols_marcados, gols_sofridos):
  pontos = 0
  for i in range(len(gols_marcados)):
    if gols_marcados[i] > gols_sofridos[i]:
      pontos += 3
    elif gols_marcados[i] == gols_sofridos[i]:
      pontos += 1
  aprov = 100 * pontos / (len(gols_marcados) * 3)
  return (pontos, aprov)

pontos, aprov = calcula_pontos(gols_marcados, gols_sofridos)
print(f"A pontuação do time foi de {pontos} e seu aproveitamento foi de {round(aprov)}%")


######

#9-Você recebeu o desafio de criar um código que calcula os gastos de uma viagem para um das quatro cidades partindo de Recife, sendo elas: 
#Salvador, Fortaleza, Natal e Aracaju.
#O custo da diária do hotel é de 150 reais em todas elas e o consumo de gasolina na viagem de carro é de 14 km/l, sendo que o valor da gasolina 
#é de 5 reais o litro. O gastos com passeios e alimentação a se fazer em cada uma delas por dia seria de [200, 400, 250, 300], respectivamente.
#Sabendo que as distâncias entre Recife e cada uma das cidades é de aproximadamente [850, 800, 300, 550] km, crie três funções nas quais: a 1ª 
#função calcule os gastos com hotel (gasto_hotel), a 2ª calcule os gastos com a gasolina (gasto_gasolina) e a 3ª os gastos com passeio e alimentação 
#(gasto_passeio).
#Para testar, simule uma viagem de 3 dias para Salvador partindo de Recife. Considere a viagem de ida e volta de carro.






######

#10-Você iniciou um estágio em uma empresa que trabalha com processamento de linguagem natural (NLP).
#Sua líder requisitou que você criasse um trecho de código que recebe uma frase digitada pela pessoa 
#usuária e filtre apenas as palavras com tamanho maior ou igual a 5, exibindo-as em uma lista. Essa 
#demanda é voltada para a análise do padrão de comportamento de pessoas na escrita de palavras acima 
#dessa quantidade de caracteres.


frase = input("Digite uma frase: ")
frase = frase.replace(',',' ').replace('.',' ').replace('!',' ').replace('?',' ').split()
print(frase)


######
