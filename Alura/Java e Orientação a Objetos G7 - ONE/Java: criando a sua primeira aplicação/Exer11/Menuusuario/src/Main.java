//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
// Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área
// com base na opção selecionada.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int escolha = leitura.nextInt();



        switch(escolha) {

            case 1:
                System.out.print("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
                break;
            case 2:
                System.out.print("Digite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                break;
            default:
               System.out.println("Tente novamente.");
                break;
        }
    }
}