
/*Faltou anotar o parâmetro dados, recebido no método cadastrar do Controller, com @Valid.*/


@PostMapping
public void cadastrar(@RequestBody DadosCadastroProduto dados) {
    repository.save(new Produto(dados));
}


public record DadosCadastroProduto(
        @NotBlank String nome,
        @NotBlank String descricao,
        @NotNull @DecimalMin(“1.00”) BigDecimal preco
) {
}
