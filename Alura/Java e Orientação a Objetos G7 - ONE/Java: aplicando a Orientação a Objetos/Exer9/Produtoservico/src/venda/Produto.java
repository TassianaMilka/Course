package venda;

public class Produto  implements Vendavel {



    double precoUnitario=12.00;
    int quantidade=2;
    double resultado1;
    double resultado2;
    double percentualDesconto=3;


    public void exibir(){


        System.out.println("------Produto-1------");


    }


    public void calcularPrecoTotal(){


        resultado1=precoUnitario * quantidade;

        System.out.println("O resultado Preço total="+resultado1);

    }


    public void aplicarDesconto() {


       resultado2=precoUnitario - precoUnitario * (percentualDesconto / 100.0);

        System.out.println("O resultado do Desconto="+resultado2);
    }

}
