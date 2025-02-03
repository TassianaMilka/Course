--!Maior, menor e diferente para realizar uma busca no banco de dado

SELECT * FROM Cliente;

SELECT * FROM Cliente WHERE IDADE = 22;

SELECT * FROM Cliente WHERE IDADE > 22;

SELECT * FROM Cliente WHERE IDADE < 22;

SELECT * FROM Cliente WHERE IDADE <= 22;

SELECT * FROM Cliente WHERE IDADE <> 22;

SELECT * FROM Cliente WHERE NOME >= 'Fernando Cavalcante';

SELECT * FROM Cliente WHERE NOME <> 'Fernando Cavalcante';

SELECT * FROM Produto;

SELECT * FROM Produto WHERE PRECO_LISTA > 16.008;

SELECT * FROM Produto WHERE PRECO_LISTA < 16.008;

SELECT * FROM Produto WHERE PRECO_LISTA <> 16.008;

SELECT * FROM Produto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;