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


8-





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
