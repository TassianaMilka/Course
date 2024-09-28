//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade()
// e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e
//GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método
//específico para cada uma das subclasses, como verificarSeEhPrimo()
// para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

import numeros.NumerosPrimos;
import verigerar.GeradorPrimo;
import verigerar.VerificadorPrimo;

public class Principal{
    public static void main(String[] args) {

        NumerosPrimos numero=new NumerosPrimos();
        numero.verificarPrimalidade();
        numero.setNumero(5);
        numero.listarPrimos();

        VerificadorPrimo numeroverificar=new VerificadorPrimo();
        numeroverificar.setNumero(5);
        numeroverificar.verificarSeEhPrimo();


        GeradorPrimo numerogerar=new GeradorPrimo();
        numerogerar. setNumeroPrimo(5);
        numerogerar.gerarProximoPrimo();




    }
}