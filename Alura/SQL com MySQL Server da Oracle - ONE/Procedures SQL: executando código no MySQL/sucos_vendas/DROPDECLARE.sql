--!Criar uma função.declarar e selecionar pelo retorno
USE sucos_vendas;

DROP function IF EXISTS f_numero_aleatorio;


DELIMITER $$

USE sucos_vendas$$

CREATE FUNCTION f_numero_aleatorio(min INT, max INT) RETURNS int(11)

BEGIN

   DECLARE vRetorno INT;

   SELECT  FLOOR((RAND() * (max-min+1)) + min) INTO vRetorno;

RETURN vRetorno;

END$$


DELIMITER ;


SELECT f_numero_aleatorio(1, 10);



USE sucos_vendas;

DROP function IF EXISTS f_cliente_aleatorio;


DELIMITER $$

USE sucos_vendas$$

CREATE  FUNCTION f_cliente_aleatorio() RETURNS varchar(11) CHARSET utf8mb4

BEGIN

    DECLARE vRetorno VARCHAR(11);

    DECLARE num_max_tabela INT;

    DECLARE num_aleatorio INT;

    SELECT COUNT(*) INTO num_max_tabela FROM tabela_de_clientes;

    SET num_aleatorio = f_numero_aleatorio(1, num_max_tabela);

    SET num_aleatorio = num_aleatorio - 1;

    SELECT CPF INTO vRetorno FROM tabela_de_clientes

    LIMIT num_aleatorio, 1;

RETURN vRetorno;

END$$


DELIMITER ;


SELECT f_cliente_aleatorio();


DELIMITER $$

USE `sucos_vendas`$$

CREATE DEFINER=`root`@`localhost` FUNCTION `f_produto_aleatorio`() RETURNS varchar(10) CHARSET utf8mb4

BEGIN

    DECLARE vRetorno VARCHAR(10);

    DECLARE num_max_tabela INT;

    DECLARE num_aleatorio INT;

    SELECT COUNT(*) INTO num_max_tabela FROM tabela_de_produtos;

    SET num_aleatorio = f_numero_aleatorio(1, num_max_tabela);

    SET num_aleatorio = num_aleatorio - 1;

    SELECT CODIGO_DO_PRODUTO INTO vRetorno FROM tabela_de_produtos

    LIMIT num_aleatorio, 1;

RETURN vRetorno;

END$$


DELIMITER ;

;


DELIMITER $$

USE sucos_vendas$$

CREATE DEFINER=root@localhost FUNCTION f_vendedor_aleatorio() RETURNS varchar(5) CHARSET utf8mb4

BEGIN

    DECLARE vRetorno VARCHAR(5);

    DECLARE num_max_tabela INT;

    DECLARE num_aleatorio INT;

    SELECT COUNT(*) INTO num_max_tabela FROM tabela_de_vendedores;

    SET num_aleatorio = f_numero_aleatorio(1, num_max_tabela);

    SET num_aleatorio = num_aleatorio - 1;

    SELECT MATRICULA INTO vRetorno FROM tabela_de_vendedores

    LIMIT num_aleatorio, 1;

RETURN vRetorno;

END$$


DELIMITER ;

;

SELECT f_cliente_aleatorio(), f_produto_aleatorio(), f_vendedor_aleatorio();





USE sucos_vendas;

DROP procedure IF EXISTS p_inserir_venda;


DELIMITER $$

USE sucos_vendas$$

CREATE PROCEDURE p_inserir_venda(vData DATE, max_itens INT,

max_quantidade INT)

BEGIN

DECLARE vCliente VARCHAR(11);

DECLARE vProduto VARCHAR(10);

DECLARE vVendedor VARCHAR(5);

DECLARE vQuantidade INT;

DECLARE vPreco FLOAT;

DECLARE vItens INT;

DECLARE vNumeroNota INT;

DECLARE vContador INT DEFAULT 1;

SELECT MAX(numero) + 1 INTO vNumeroNota from notas_fiscais;

SET vCliente = f_cliente_aleatorio();

SET vVendedor = f_vendedor_aleatorio();

INSERT INTO notas_fiscais (CPF, MATRICULA, DATA_VENDA, NUMERO, IMPOSTO)

VALUES (vCliente, vVendedor, vData, vNumeroNota, 0.18);

SET vItens = f_numero_aleatorio(1, max_itens);

WHILE vContador <= vItens

DO

   SET vProduto = f_produto_aleatorio();

   SET vQuantidade = f_numero_aleatorio(10, max_quantidade);

   SELECT PRECO_DE_LISTA INTO vPreco FROM tabela_de_produtos

   WHERE CODIGO_DO_PRODUTO = vProduto;

   INSERT INTO itens_notas_fiscais (NUMERO, CODIGO_DO_PRODUTO,

   QUANTIDADE, PRECO) VALUES (vNumeroNota, vProduto, vQuantidade, vPreco);

   SET vContador = vContador + 1;

END WHILE;

END$$

DELIMITER ;



USE sucos_vendas;

DROP procedure IF EXISTS p_calculo_faturamento;


DELIMITER $$

USE sucos_vendas$$

CREATE PROCEDURE p_calculo_faturamento()

BEGIN

  DELETE FROM TAB_FATURAMENTO;

  INSERT INTO TAB_FATURAMENTO

  SELECT A.DATA_VENDA, SUM(B.QUANTIDADE * B.PRECO) AS TOTAL_VENDA FROM

  NOTAS_FISCAIS A INNER JOIN ITENS_NOTAS_FISCAIS B

  ON A.NUMERO = B.NUMERO

  GROUP BY A.DATA_VENDA;

END$$


DELIMITER ;



CREATE TABLE TAB_FATURAMENTO

(DATA_VENDA DATE NULL, TOTAL_VENDA FLOAT);


DELIMITER //

CREATE TRIGGER TG_CALCULA_FATURAMENTO_INSERT AFTER INSERT ON ITENS_NOTAS_FISCAIS

FOR EACH ROW BEGIN

  Call p_calculo_faturamento;

END//


DELIMITER //

CREATE TRIGGER TG_CALCULA_FATURAMENTO_UPDATE AFTER UPDATE ON ITENS_NOTAS_FISCAIS

FOR EACH ROW BEGIN

  Call p_calculo_faturamento;

END//


DELIMITER //

CREATE TRIGGER TG_CALCULA_FATURAMENTO_DELETE AFTER DELETE ON ITENS_NOTAS_FISCAIS

FOR EACH ROW BEGIN

  Call p_calculo_faturamento;

END//