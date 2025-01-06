 
/*Faltou adicionar o caractere dois-pontos (:) antes do parâmetro data.*/

@Query(“””
    select p from Produto p
    where
    p.preco >= :preco
    and
    p.dataCadastro >= data
“””)
List<Produto> buscarPorPrecoEData(BigDecimal preco, LocalDate data);
