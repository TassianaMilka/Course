//Crie uma interface Vendavel com métodos para calcular o preço total de
//um produto com base na quantidade comprada e aplicar descontos. Implemente
//essa interface nas classes Produto e Servico, cada uma fornecendo a sua
//própria lógica de cálculo de preço.

import venda.Produto;
import venda.Servico;

public class Principal  {
    public static void main(String[] args) {


        Produto vendaum=new Produto();
        vendaum.exibir();
        vendaum.calcularPrecoTotal();
        vendaum.aplicarDesconto();


        Servico vendadois=new Servico();
        vendadois.exibir();
        vendadois.calcularPrecoTotal();
        vendadois.aplicarDesconto();

    }
}