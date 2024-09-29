//Crie uma classe CalculadoraSalaRetangular que implementa uma interface
// CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para
// calcular a área e o perímetro de uma sala retangular. A classe deve receber
// altura e largura como parâmetros.

import calculadora.CalculadoraSalaRetangular;

public class Principal {
    public static void main(String[] args) {

        CalculadoraSalaRetangular cal=new CalculadoraSalaRetangular();
        cal.calcularArea();
        cal.calcularPerimetro();

    }
}