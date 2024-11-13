/*Esta consulta vai transformar tanto o título do livro quanto a string de busca em letras minúsculas antes de fazer a comparação,
tornando-a case-insensitive. Poderíamos também utilizar o ILIKE para fazer essa busca.*/


SELECT livro FROM Livro livro WHERE LOWER(livro.titulo) = LOWER(:titulo)
