--!Filtragem de Registro da tabela do banco de dado

SELECT * FROM Produto WHERE PRODUTO = '544931';

SELECT * FROM Cliente WHERE CIDADE = 'Rio de Janeiro';

SELECT * FROM Produto WHERE SABOR = 'Cítricos';

UPDATE Produto SET SABOR = 'Cítricos' WHERE SABOR = 'Limão';