//Crie uma interface Calculavel com um método double calcularPrecoFinal().
//Implemente essa interface nas classes Livro e ProdutoFisico, cada uma
//retornando o preço final considerando descontos ou taxas adicionais.


import livro.Livro;
import livro.ProdutoFisico;


public class Principal{
    public static void main(String[] args) {

        Livro livroprodutoum=new Livro();
        livroprodutoum.calcularPrecoFinal();

        ProdutoFisico livroprodutodois =new ProdutoFisico();
        livroprodutodois.calcularPrecoFinal();




    }




}