USE sucos;

--!Incluir a chave

ALTER TABLE Produto ADD PRIMARY KEY (PRODUTO);

INSERT INTO Produto (
PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
PRECO_LISTA) VALUES
('1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);

UPDATE Produto SET EMBALAGEM = 'Garrafa'
WHERE PRODUTO = '1078680';


