//A implementação do método compareTo está correta e fazendo
// a ordenação pelo saldo de maneira decrescente.
//@Override
//public int compareTo(Conta outra) {
//    if (this.getSaldo() < outra.getSaldo()) {
//        return 1;
//    } else if (this.getSaldo() > outra.getSaldo()) {
//        return -1;
//    } else {
//        return 0;
//    }
//}

public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters e setters omitidos
}

