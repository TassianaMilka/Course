--!Selecionar os dados que estão na  script na utilização do drop que pode alterar o que já é existente

select 'Alô Mundo !!!!';


USE `sucos_vendas`;
DROP procedure IF EXISTS `alo_mundo`;
DELIMITER $$
USE `sucos_vendas`$$
CREATE PROCEDURE `alo_mundo` ()
BEGIN
select 'Alô Mundo !!!!';
END$$
DELIMITER ;



Call alo_mundo;


USE `sucos_vendas`;
DROP procedure IF EXISTS `mostra_numero`;
DELIMITER $$
USE `sucos_vendas`$$
CREATE PROCEDURE `mostra_numero` ()
BEGIN
select (1 + 9) - 5;
END$$
DELIMITER ;



Call mostra_numero;



USE `sucos_vendas`;
DROP procedure IF EXISTS `mostra_numero_alias`;
DELIMITER $$
USE `sucos_vendas`$$
CREATE PROCEDURE `mostra_numero_alias` ()
BEGIN
select (1 + 9) - 5 as RESULTADO;
END$$
DELIMITER ;


Call mostra_numero_alias;


USE `sucos_vendas`;
DROP procedure IF EXISTS `sp_com_funcoes`;
DELIMITER $$
USE `sucos_vendas`$$
CREATE PROCEDURE `sp_com_funcoes` ()
BEGIN
SELECT CONCAT('Alô Mundo !!!!', '.....', (1 + 9) - 5) as ITENS_COMBINADOS;
END$$
DELIMITER ;


Call sp_com_funcoes;


USE `sucos_vendas`;
DROP procedure IF EXISTS `sp_com_comentarios`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `sp_com_comentarios` ()
BEGIN

/* Vamos exibir itens combinados
entre textos e números */

-- Usando a função CONCAT

SELECT CONCAT('Alô Mundo !!!!', '.....', (1 + 9) - 5) as ITENS_COMBINADOS;
END$$
DELIMITER ;



Call sp_com_comentarios;



USE `sucos_vendas`;
DROP procedure IF EXISTS `alo_mundo_2`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `alo_mundo_2` ()
BEGIN
SELECT 'Alô Mundo !!!!, tudo bem?' as RESULTADO;
END$$
DELIMITER ;



USE `sucos_vendas`;
DROP procedure IF EXISTS `alo_mundo_3`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `alo_mundo_3`()
BEGIN
SELECT 'Alô Mundo !!!!, tudo bem? Versão 3' as RESULTADO;
END$$
DELIMITER ;


USE `sucos_vendas`;
DROP procedure IF EXISTS `alo_mundo_2`;



USE `sucos_vendas`;
DROP procedure IF EXISTS `exibe_variavel`;
DELIMITER $$

USE `sucos_vendas`$$
CREATE PROCEDURE `exibe_variavel` ()
BEGIN
declare texto char(20) default 'Alô Mundo !!!!';
SELECT texto;
END$$
DELIMITER ;


call exibe_variavel;


