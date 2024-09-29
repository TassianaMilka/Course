package livro;

public class Livro implements Calculavel{

     String titulo="Name book read one";
     String nome="Name author one";
     double preco=20.00;

    public void calcularPrecoFinal() {


      double resul1 =preco * 0.3;

      System.out.println(titulo);
      System.out.println(nome);
      System.out.println("O preço final do livro="+resul1);

 }
}