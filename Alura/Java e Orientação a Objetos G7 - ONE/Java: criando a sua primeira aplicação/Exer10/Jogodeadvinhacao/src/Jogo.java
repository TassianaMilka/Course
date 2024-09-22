//Jogo  de advinhação do número secreto.

import java.util.Random;
import java.util.Scanner;

public class Jogo{

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int tentativas = 0;
        int num = 0;

        while (tentativas < 3) {
            System.out.print("Informe um número");
            num = leitura.nextInt();
            tentativas++;

            if (num == numero) {
                System.out.println("Acertou o número");
                break;
            } if (num < numero) {
                    System.out.println("O número digitado é menor que o número gerado.");
                } else {
                    System.out.println("O número digitado é maior que o número gerado.");

            }
        }

        if (tentativas == 3 && num != numero) {
            System.out.println("Você não conseguiu acertar o número= " + numero);
        }
    }
}