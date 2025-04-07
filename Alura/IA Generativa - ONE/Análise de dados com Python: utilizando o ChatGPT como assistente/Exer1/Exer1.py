#Um colega da equipe de dados da Zoop solicitou a análise de outro conjunto de dados além do enviado pela liderança. 
#Esses dados se referem às vendas totais obtidas por 896 franquias no primeiro mês do trimestre de análise da Zoop.


import pandas as pd
import numpy as np
import requests  

url_franquias = 'https://raw.githubusercontent.com/alura-cursos/python-analise-chatgpt-assistente/main/Dados/vendas_mensal_franquias.json'

response = requests.get(url_franquias)
data = response.json()

df = pd.DataFrame(data)


df



