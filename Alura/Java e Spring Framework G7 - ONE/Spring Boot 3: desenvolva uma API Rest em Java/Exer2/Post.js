
/*Faltou anotar o parâmetro dados, recebido no método cadastrar do Controller, com @RequestBody.*/


@PostMapping
public void cadastrar(DadosCadastroProduto dados) {
    System.out.println(dados);
}


public record DadosCadastroProduto(String nome, String descricao, BigDecimal preco){}




{
    "preco" : 399.99,
    "descricao" : "Wireless. Cor: branca",
    "nome" : "Fone de ouvido"
}


