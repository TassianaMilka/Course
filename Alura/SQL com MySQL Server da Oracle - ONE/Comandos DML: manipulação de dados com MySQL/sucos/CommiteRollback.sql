--!Selecionar o dado,finalizar com rollback e comentar pelo commit para salvar
START TRANSACTION;

SELECT * FROM VENDEDORES;

UPDATE VENDEDORES SET COMISSAO= COMISSAO * 1.15;

ROLLBACK;

COMMIT;


START TRANSACTION;

--Inserir os dados da tabela com value


