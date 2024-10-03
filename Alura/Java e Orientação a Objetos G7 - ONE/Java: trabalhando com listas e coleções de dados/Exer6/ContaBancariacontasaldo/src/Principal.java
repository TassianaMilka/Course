//Crie uma classe ContaBancaria com propriedades como número da conta e saldo.
// Em seguida, crie uma lista de contas bancárias com diferentes saldos.
// Utilize um loop para encontrar e imprimir a conta com o maior saldo.

import dados.ContaBancaria;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

       ContaBancaria conta1=new ContaBancaria("1436-235",12.000);
       ContaBancaria conta2 =new ContaBancaria("1412-145",7.000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for(ContaBancaria conta: listaContas){


            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }

        }

        System.out.println("Conta do maior numero: " + contaMaiorSaldo.getNumeroconta());
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getSaldo());


    }
}
