package conversor;

public class ConversorMoeda implements ConversaoFinanceira {
     double valorDolar=1.80;
     double cotacaoDolar=4.80;


    public void converterDolarParaReal() {

        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }


}