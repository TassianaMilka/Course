//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit()
//e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que
//implementa essa interface com as fórmulas de conversão e exibe os resultados.



import conversor.ConversorTemperaturaPadrao;

public class Principal {
    public static void main(String[] args) {


        ConversorTemperaturaPadrao conversor=new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit();
        conversor.fahrenheitParaCelsius();




    }
}