//Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
// Utilize variáveis para representar os valores das temperaturas e imprima no console
// o valor convertido de Celsius para Fahrenheit.

public class Main {
    public static void main(String[] args) {

   double temperatura = 30.4;
   double cal=(temperatura * 1.8) + 32;

        System.out.println(cal);
        int temperaturaFah = (int) cal;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFah);

    }
}