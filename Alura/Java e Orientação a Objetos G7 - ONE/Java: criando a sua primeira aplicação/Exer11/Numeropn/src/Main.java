//Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número");
        int num = leitura.nextInt();

        if (num >= 0) {
            System.out.println("O número é positivo ");

        } else if (num <= 0) {

            System.out.println("O número é negativo");

        }
    }
}