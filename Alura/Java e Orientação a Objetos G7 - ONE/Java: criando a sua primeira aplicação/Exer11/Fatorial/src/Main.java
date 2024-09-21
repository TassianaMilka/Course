//Crie um programa que solicite ao usuário um número e calcule o fatorial desse
// número.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int fatorial = 1;


        System.out.println("Digite o número");
        int num = leitura.nextInt();

        fatorial *= num;

        System.out.println("O resultado=" + fatorial);

    }
}