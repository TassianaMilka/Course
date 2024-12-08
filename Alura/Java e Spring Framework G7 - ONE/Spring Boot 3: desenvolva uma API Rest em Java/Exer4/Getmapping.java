

/*O parâmetro paginação não está sendo utilizado  e O retorno do método está como void. */

@GetMapping
public void carregarProdutosCadastrados(Pageable paginacao) {
    repository.findAll().stream().map(DadosListagemProduto::new);
}
