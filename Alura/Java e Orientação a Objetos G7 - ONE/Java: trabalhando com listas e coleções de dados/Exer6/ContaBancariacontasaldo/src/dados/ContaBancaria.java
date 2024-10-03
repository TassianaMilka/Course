package dados;

public class ContaBancaria {

    private String numeroconta;
    private double saldo;


    public ContaBancaria(String numeroconta,double saldo) {
        this.numeroconta = numeroconta;
        this.saldo=saldo;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
