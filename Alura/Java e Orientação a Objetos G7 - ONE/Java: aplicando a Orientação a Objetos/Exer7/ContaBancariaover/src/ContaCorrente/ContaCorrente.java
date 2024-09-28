package ContaCorrente;

import Conta.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
   private  double saldo;
   private double tarifaMensal;


    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void cobrarTarifaMensal(){

        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
        
    }
}
