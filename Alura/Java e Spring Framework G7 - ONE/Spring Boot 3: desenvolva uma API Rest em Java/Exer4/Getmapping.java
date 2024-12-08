

/*O parâmetro paginação não está sendo utilizado.*/

@GetMapping
public void carregarProdutosCadastrados(Pageable paginacao) {
    repository.findAll().stream().map(DadosListagemProduto::new);
}
