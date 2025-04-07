
#Com a ajuda do ChatGPT faça o estudo dos dados presentes em cada coluna do conjunto de dados e identifique as inconsistências que podem estar presentes, 
#como dados ausentes ou linhas duplicadas.


# Verifique as primeiras linhas do DataFrame
df.head()

# Resumo estatístico das colunas numéricas
df.describe()

# Informações gerais sobre o DataFrame, incluindo contagem de valores não nulos
df.info()

# Verifique se existem valores duplicados
df.duplicated().sum()

# Verifique se existem valores ausentes por coluna
df.isnull().sum()

# Contagem de valores únicos em cada coluna
df.nunique()

# Exiba as categorias únicas na coluna 'loja'
df['loja'].unique()

# Exiba as categorias únicas na coluna 'itens_comercializados'
df['itens_comercializados'].unique()

# Verifique a contagem de valores em uma coluna específica, por exemplo, 'quantidade_clientes'
df['quantidade_clientes'].value_counts()

# Estatísticas para a coluna 'vendas'
df['vendas'].agg(['min', 'max', 'mean', 'median', 'std'])

# Estatísticas para a coluna 'quantidade_clientes'
df['quantidade_clientes'].agg(['min', 'max', 'mean', 'median', 'std'])
