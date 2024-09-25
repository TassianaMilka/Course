public class Produto {

    private  String nome;
    private double preco;
    double valor;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



       void  aplicarDesconto() {

        double resultado =  preco * (valor / 100);

           preco -= resultado;

    }
}
