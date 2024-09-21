//Crie um programa que solicite ao usuário um número e exiba a tabuada desse
// número de 1 a 10.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);




            System.out.println("Digite o primeiro número para a multiplicação=");
            int num1 = leitura.nextInt();

            System.out.println("Digite o segundo número para a multiplicação=");
            int num2 = leitura.nextInt();

            int mul = num1 * num2;
            System.out.println("Resultado");
            System.out.println(mul);



        }
    }

