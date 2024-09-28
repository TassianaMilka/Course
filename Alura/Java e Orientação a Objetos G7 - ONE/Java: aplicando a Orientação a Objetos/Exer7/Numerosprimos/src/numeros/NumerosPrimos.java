package numeros;

public class NumerosPrimos {
private int Numero;
int i;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public boolean verificarPrimalidade() {

        if (Numero <= 1) {
            return false;
        }
        for ( i = 2; i * i <= Numero; i++) {
            if (Numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos() {


        System.out.print(verificarPrimalidade());



    }


}



