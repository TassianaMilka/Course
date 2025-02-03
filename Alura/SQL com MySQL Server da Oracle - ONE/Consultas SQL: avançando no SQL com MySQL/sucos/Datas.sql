--!Selecionar pela data o maior,menor e igual na tabela do banco de dado.

SELECT * FROM Cliente;

SELECT * FROM Cliente WHERE DATA_NASCIMENTO = '1995-01-13';

SELECT * FROM Cliente WHERE DATA_NASCIMENTO > '1995-01-13';

SELECT * FROM Cliente WHERE DATA_NASCIMENTO <= '1995-01-13';

SELECT * FROM Cliente WHERE YEAR(DATA_NASCIMENTO) = 1995;

SELECT * FROM Cliente WHERE MONTH(DATA_NASCIMENTO) = 10;