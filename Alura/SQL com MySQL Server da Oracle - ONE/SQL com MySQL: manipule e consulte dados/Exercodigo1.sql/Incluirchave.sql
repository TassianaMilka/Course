USE Exercodigo1;

ALTER TABLE Vendedores2 ADD PRIMARY KEY (MATRICULA);

INSERT INTO Vendedores2
(MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
VALUES
('00235','Márcio Almeida Silva','2014-08-15',0.08,0);


INSERT INTO Vendedores2
(MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
VALUES
('00236','Cláudia Morais','2013-09-17',0.08,1);

INSERT INTO Vendedores2
(MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
VALUES
('00237','Roberta Martins','2017-03-18',0.11,1);


INSERT INTO Vendedores2
(MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
VALUES
('00238','Pericles Alves','2016-08-21',0.11,0);