
/*A classe Controller não foi mapeada corretamente de @Controller ou com @RestController.*/

@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String produtosEmEstoque() {
        return "Produtos em estoque...";
    }
}
