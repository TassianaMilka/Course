
//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
// preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
// valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o
// ao preço original e imprima o novo preço com desconto.
public class Main {
    public static void main(String[] args) {

        double precoOriginal=12.90;
        double percentualDesconto=10.00;
        double calP=precoOriginal*percentualDesconto;

        System.out.println("O cálculo sobre o preço original e percentual desconto");
        System.out.println(calP);

        double calS= precoOriginal-calP;
        System.out.println("O novo preço de desconto");
        System.out.println(calS);
    }
}