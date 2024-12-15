/*O código anterior não devolverá o código 201 como resposta e o cabeçalho Location será criado de maneira incorreta.*/

@PostMapping
@Transactional
public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroProduto dados) throws Exception {
    var produto = new Produto(dados);
    repository.save(produto);

    var uri = new URI("http://localhost:8080/produtos/{id}");

    return ResponseEntity.ok(new DadosDetalhamentoProduto(produto));
} 


