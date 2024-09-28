package verigerar;
import numeros.NumerosPrimos;


public class VerificadorPrimo extends NumerosPrimos  {
private int numero;

    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    public void verificarSeEhPrimo() {
                System.out.println("\n");
                if (5==numero) {
                    System.out.println(numero + " é primo.");
                } else if(5!=numero){
                    System.out.println(numero + " não é primo.");
                }
    }
}
