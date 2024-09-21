//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima
//uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo
//é maior.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);

            System.out.println("Digite o primeiro número");
            int num1 = leitura.nextInt();

            System.out.println("Digite o segundo número");
            int num2 = leitura.nextInt();

            if (num1 == num2) {
                System.out.println("Os números são iguais ");

            } else if (num1 >= num2) {

                System.out.println("O primeiro número é maior");


            }else{

                System.out.println("O segundo número é maior");


            }
        }

}
