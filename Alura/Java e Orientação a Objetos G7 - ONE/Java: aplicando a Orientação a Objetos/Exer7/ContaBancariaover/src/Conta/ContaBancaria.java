package Conta;

public class ContaBancaria {
  private double saldo;
  private double depositar;
  private double  valor;

    public double getSaldo() {
        return saldo;
    }


    public double getDepositar() {

        return depositar;
    }

    public double getValor() {
        return valor;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("O deposito contém o valor ="+ valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("O valor retirado"+ valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {

        System.out.println("Saldo atual: " + saldo);
    }


    public void sacar() {
    }
}



