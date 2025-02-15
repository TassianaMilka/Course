--!Declarar uma variavél de tabela,validação com if and else
USE `sucos_vendas`;
DROP procedure IF EXISTS `cliente_novo_velho`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `cliente_novo_velho`(vCPF VARCHAR(20))
BEGIN
   DECLARE vResultado VARCHAR(20);
   DECLARE vDataNascimento DATE;
   SELECT DATA_DE_NASCIMENTO INTO vDataNascimento FROM
   tabela_de_clientes WHERE CPF = vCPF;
   IF vDataNascimento < '20000101' THEN
      SET vResultado = 'CLIENTE VELHO';
   ELSE
      SET vResultado = 'CLIENTE NOVO';
   END IF;
   SELECT vResultado;
END$$
DELIMITER ;


Call cliente_novo_velho ('19290992743');



USE `sucos_vendas`;
DROP procedure IF EXISTS `acha_status_preco_2`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `acha_status_preco_2` (vProduto VARCHAR(50))
BEGIN
   DECLARE vPreco FLOAT;
   DECLARE vMensagem VARCHAR(30);
   SELECT PRECO_DE_LISTA INTO vPreco FROM tabela_de_produtos
   WHERE codigo_do_produto = vProduto;
   IF vPreco >= 12 THEN
      SET vMensagem = 'PRODUTO CARO.';
   ELSEIF vPreco >= 7  AND vPreco < 12 THEN
      SET vMensagem = 'PRODUTO EM CONTA.';
   ELSE
      SET vMensagem = 'PRODUTO BARATO.';
   END IF;
   SELECT vMensagem;
END$$
DELIMITER ;


Call acha_status_preco_2 ('1000889');



USE `sucos_vendas`;
DROP procedure IF EXISTS `acha_tipo_sabor`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `acha_tipo_sabor`(vProduto VARCHAR(50))
BEGIN
  DECLARE vSabor VARCHAR(50);
  SELECT SABOR INTO vSabor FROM tabela_de_Produtos
  WHERE codigo_do_produto = vProduto;
  CASE vSabor
  WHEN 'Lima/Limão' THEN SELECT 'Cítrico';
  WHEN 'Laranja' THEN SELECT 'Cítrico';
  WHEN 'Morango/Limão' THEN SELECT 'Cítrico';
  WHEN 'Uva' THEN SELECT 'Neutro';
  WHEN 'Morango' THEN SELECT 'Neutro';
  ELSE SELECT 'Ácidos';
  END CASE;
END$$
DELIMITER ;



CALL acha_tipo_sabor('1000889');



USE `sucos_vendas`;
DROP procedure IF EXISTS `acha_tipo_sabor_erro`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE  PROCEDURE `acha_tipo_sabor_erro`(vProduto VARCHAR(50))
BEGIN
  DECLARE vSabor VARCHAR(50);
  SELECT SABOR INTO vSabor FROM tabela_de_Produtos
  WHERE codigo_do_produto = vProduto;
  CASE vSabor
  WHEN 'Lima/Limão' THEN SELECT 'Cítrico';
  WHEN 'Laranja' THEN SELECT 'Cítrico';
  WHEN 'Morango/Limão' THEN SELECT 'Cítrico';
  WHEN 'Uva' THEN SELECT 'Neutro';
  WHEN 'Morango' THEN SELECT 'Neutro';
  END CASE;
END$$
DELIMITER ;


ELSE SELECT 'Ácidos';


CALL acha_tipo_sabor_erro('1004327');


USE `sucos_vendas`;
DROP procedure IF EXISTS `acha_tipo_sabor_erro`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE  PROCEDURE `acha_tipo_sabor_erro`(vProduto VARCHAR(50))
BEGIN
  DECLARE vSabor VARCHAR(50);
  DECLARE msgErro VARCHAR(30);
  DECLARE CONTINUE HANDLER FOR 1339 SET msgErro = 'O case não está completo';
  SELECT SABOR INTO vSabor FROM tabela_de_Produtos
  WHERE codigo_do_produto = vProduto;
  CASE vSabor
  WHEN 'Lima/Limão' THEN SELECT 'Cítrico';
  WHEN 'Laranja' THEN SELECT 'Cítrico';
  WHEN 'Morango/Limão' THEN SELECT 'Cítrico';
  WHEN 'Uva' THEN SELECT 'Neutro';
  WHEN 'Morango' THEN SELECT 'Neutro';
  END CASE;
  SELECT msgErro;
END$$
DELIMITER ;

CALL acha_tipo_sabor_erro('1004327');


USE `sucos_vendas`;
DROP procedure IF EXISTS `acha_status_preco_case`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `acha_status_preco_case`(vProduto VARCHAR(50))
BEGIN
    DECLARE vPreco FLOAT;
    DECLARE vMensagem VARCHAR(30);
    SELECT PRECO_DE_LISTA INTO vPreco FROM tabela_de_produtos
    WHERE codigo_do_produto = vProduto;
    CASE
    WHEN vPreco >= 12 THEN SET vMensagem = 'PRODUTO CARO.';
    WHEN vPreco >= 7 AND vPreco < 12 THEN  SET vMensagem = 'PRODUTO EM CONTA.';
    WHEN vPreco < 7 THEN SET vMensagem = 'PRODUTO BARATO';
    END CASE;
    SELECT vMensagem;
END$$
DELIMITER ;


CALL acha_status_preco_case('1004327');


CREATE TABLE TAB_LOOPING (ID INT);


USE `sucos_vendas`;
DROP procedure IF EXISTS `looping_while`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `looping_while`(vNumInicial INT, vNumFinal INT)
BEGIN
   DECLARE vContador INT;
   DELETE FROM TAB_LOOPING;
   SET vContador = vNumInicial;
   WHILE vContador <= vNumFinal
   DO
      INSERT INTO TAB_LOOPING (ID) VALUES (vContador);
      SET vContador = vContador + 1;
   END WHILE;
   SELECT * FROM TAB_LOOPING;
END$$
DELIMITER ;


call looping_while (1, 1000);
