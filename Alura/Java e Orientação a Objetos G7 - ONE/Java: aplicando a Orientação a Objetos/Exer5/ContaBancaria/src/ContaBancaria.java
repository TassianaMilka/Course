public class ContaBancaria {


    private int numeroConta;

    private double saldo;

    public String titular;



    void exibir(){

     System.out.println("Dado do usuário");

    }

    public int getNumeroConta() {
        return numeroConta;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
