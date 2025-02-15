
--!Qual seria o comando SQL para selecionar todos os itens de notas fiscais cuja quantidade seja maior que 60 e preço menor ou igual a 3?


SELECT * FROM itens_notas_fiscais 
WHERE QUANTIDADE > 60 AND PRECO <= 3;
