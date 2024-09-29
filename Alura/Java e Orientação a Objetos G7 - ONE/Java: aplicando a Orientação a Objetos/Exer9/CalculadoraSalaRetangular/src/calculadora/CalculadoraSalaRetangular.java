package calculadora;

public class CalculadoraSalaRetangular {

   double alturaArea=4.80;
   double larguraArea=3.50;
    double area;
    double perimetro;
    double alturaPerimetro=3.80;
    double  larguraPerimetro=2.50;

    public void calcularArea() {
         area = alturaArea * larguraArea;
        System.out.println("A área da sala retangular é: " + area);
    }


    public void calcularPerimetro() {
        perimetro = 2 * (alturaPerimetro + larguraPerimetro);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }

}
