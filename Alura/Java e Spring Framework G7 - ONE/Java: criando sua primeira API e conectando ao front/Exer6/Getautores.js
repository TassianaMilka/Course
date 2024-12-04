
/*Parâmetros no método que têm exatamente o mesmo nome do que está declarado na url, dentro de chaves edeixar parâmetros no método com 
nomes diferentes do que foi deixado na url*/



@GetMapping("/autores/{idAutor}/livros/{idLivro}")
public String obterLivroPeloId(@PathVariable Integer idAutor, @PathVariable Integer idLivro){
  return service.obterLivroPeloId(idAutor, idLivro);
}


@GetMapping("/autores/{id1}/livros/{id2}")
public String obterLivroPeloId(@PathVariable(“id1”) Integer idAutor, @PathVariable(“id2” ) Integer idLivro){
  return service.obterLivroPeloId(idAutor, idLivro);
}
