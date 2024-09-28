
//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo().
// Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a
// subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

import Conta.ContaBancaria;
import ContaCorrente.ContaCorrente;

public class Principal{



    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setDepositar(1200);
        conta.setValor(100);
        conta.sacar();
        conta.consultarSaldo();



       ContaCorrente contaco = new ContaCorrente();
       contaco.setSaldo(10);
       contaco.setTarifaMensal(26);
       contaco.cobrarTarifaMensal();







    }
}