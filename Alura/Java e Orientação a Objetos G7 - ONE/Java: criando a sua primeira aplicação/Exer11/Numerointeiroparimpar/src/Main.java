//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite o número");
        int num = leitura.nextInt();

        if (num % 2 == 0 ) {

            System.out.println("O número é par ");

        } else{


            System.out.println("O número é impar ");
        }
    }
}