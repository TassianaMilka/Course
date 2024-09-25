//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado),
// saldo (privado) e titular (publico). Implemente métodos getters e setters para
// os atributos privados.
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(2345);
        conta.setSaldo(3000);
        conta.titular = "Nome";


        conta.exibir();

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

    }
}