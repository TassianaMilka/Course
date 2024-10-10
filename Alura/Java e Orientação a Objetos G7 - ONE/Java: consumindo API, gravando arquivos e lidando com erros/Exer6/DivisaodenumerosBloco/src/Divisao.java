//Crie um programa simples que solicita dois números ao usuário e realiza a
//divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar
//a exceção que pode ocorrer caso o usuário informe 0 como divisor

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroP;
        int numeroS;
        int resultado;


        System.out.println("Informe o primeiro numero\n");
        numeroP = scanner.nextInt();

        System.out.println("Informe o segundo numero\n");
        numeroS = scanner.nextInt();


        try {
            resultado = numeroP/numeroS;

            System.out.println("O resultado dos dois número da Divisão=" + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Erro");
        }
    }
}