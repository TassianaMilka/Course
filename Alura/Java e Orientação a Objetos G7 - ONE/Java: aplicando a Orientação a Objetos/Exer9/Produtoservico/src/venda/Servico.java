package venda;

public class Servico  implements Vendavel {


    double precoUnitario=20.00;
    int quantidade=3;
    double result1;
    double result2;
    double percentualDesconto=3;

    public void exibir(){


        System.out.println("------Produto-2------");


    }


    public void calcularPrecoTotal() {


        result1=precoUnitario * quantidade;

        System.out.println("O resultado Preço total="+result1);

    }


    public void aplicarDesconto() {


        result2=precoUnitario - precoUnitario * (percentualDesconto / 100.0);

        System.out.println("O resultado do Desconto="+result2);
    }

}
