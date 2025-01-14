

SELECT v.nome AS nome_vendedor, SUM(vd.valor) AS total_vendas
FROM vendedores v
JOIN vendas vd ON v.id = vd.id_vendedor
WHERE vd.data > DATE_SUB(CURDATE(), INTERVAL 90 DAY)
GROUP BY v.nome
ORDER BY total_vendas;


/*O código SQL gerado está incorreto.*/
