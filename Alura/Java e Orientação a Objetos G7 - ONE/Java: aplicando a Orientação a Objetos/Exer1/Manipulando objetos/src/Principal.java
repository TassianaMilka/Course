
//O atributo quantidade foi preenchido de maneira incorreta w  Existe um erro ao instanciar o objeto venda1.

public class Venda {

    String produto;
    int quantidade;
    double valorUnitario;
    double valorTotal;

}


public static void main(String[] args) {
    Venda venda1 = Venda();
    venda1.produto = "Camiseta";
    venda1.quantidade = "2";
    venda1.valorUnitario = 25.50;

    System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);

}

