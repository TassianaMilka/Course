
--!Selecionar os dados da tabela
SELECT * FROM PRODUTOS;

--!Update de produtos e realizar uma multiplicação do preço lista com 1.10
UPDATE PRODUTOS SET PRECO_LISTA=5 WHERE CODIGO = '1000889';

UPDATE PRODUTOS SET EMBALAGEM='PET',TAMANHO = '1 Litro',DESCRITOR='Sabor da Montanha-1 Litro-Uva' WHERE CODIGO='1000889';

SELECT * FROM PRODUTOS WHERE SABOR='Maracujá';

UPDATE PRODUTOS set PRECO_LISTA=PRECO_LISTA * 1.10 WHERE SABOR='Maracujá';

