//Vai imprimir o preço que é 2.00.
public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
public class Teste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.50);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
    }
}