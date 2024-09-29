package conversor;

public class ConversorTemperaturaPadrao  implements ConversorTemperatura {

    double temperaturaCelsius=12;
    double temperaturaFahrenheit=20;
    double result1;
    double result2;


    public void celsiusParaFahrenheit(){


        result1=(temperaturaCelsius * 9 / 5) + 32;

        System.out.println("Celsius para Fahrenheit="+result1);

    }



    public void  fahrenheitParaCelsius() {



            result2 = (temperaturaFahrenheit - 32) * 5 / 9;

            System.out.println("Fahrenheit para Celsius="+result2);

        }


}
