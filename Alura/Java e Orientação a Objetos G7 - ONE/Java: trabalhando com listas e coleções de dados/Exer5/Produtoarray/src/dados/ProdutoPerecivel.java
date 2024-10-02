package dados;

public class ProdutoPerecivel extends Produto {

      int  dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;

    }
}
