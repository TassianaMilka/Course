//Crie uma classe Calculadora com um método que recebe um número como parâmetro e
// retorna o dobro desse número.

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.numero = 2;


       cal.exibir();



        System.out.println(cal.resultado());

    }
}