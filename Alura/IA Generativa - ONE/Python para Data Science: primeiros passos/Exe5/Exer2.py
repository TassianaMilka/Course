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



