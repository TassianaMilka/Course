package livro;

public class ProdutoFisico  implements Calculavel{


    String titulo="Name book read two";
    String nome="Name author two";
    double preco=29.00;



    public void calcularPrecoFinal() {


        double resul2 =preco * 0.3;

        System.out.println(titulo);
        System.out.println(nome);
        System.out.println("O preço final do livro="+resul2);

    }

}
