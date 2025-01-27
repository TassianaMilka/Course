
--!Selecionar pelo preço da lista o valor conforme o produto condição one/or(Um/Ou).


SELECT * FROM Produto;

SELECT * FROM Produto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;
SELECT * FROM Produto WHERE PRECO_LISTA >= 16.007;
SELECT * FROM Produto WHERE PRECO_LISTA <= 16.009;



SELECT * FROM Cliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M')
 OR (cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins');