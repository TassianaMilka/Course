
--!Criar chaves estrangeiras para realizar a ligação entre as tabelas, indique qual comando altera a TABELA_DE_VENDAS para realizar a criação da chave estrangeira com a tabela de CLIENTES através do campo CPF

ALTER TABLE tabela_de_vendas ADD CONSTRAINT FK_Clientes
FOREIGN KEY (CPF)
REFERENCES clientes (CPF);
