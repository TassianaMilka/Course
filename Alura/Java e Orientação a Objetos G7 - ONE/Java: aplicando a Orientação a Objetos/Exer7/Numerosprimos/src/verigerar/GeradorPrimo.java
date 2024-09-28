package verigerar;
import numeros.NumerosPrimos;

public class GeradorPrimo extends NumerosPrimos  {
    int proximoNumero;
   private  int numeroPrimo;

    public int getNumeroPrimo() {
        return numeroPrimo;
    }

    public void setNumeroPrimo(int numeroPrimo) {
        this.numeroPrimo = numeroPrimo;
    }

    public void gerarProximoPrimo(){

                proximoNumero = numeroPrimo + 2;
                System.out.println("\n");
                System.out.println("o Próximo número primo="+proximoNumero);




    }
}
