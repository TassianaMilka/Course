package tabuada;

public class TabuadaMultiplicacao implements Tabuada {

public void mostrarTabuada() {
      int numero=3;
    System.out.println("Tabuada de multiplicação do número " + numero);
    for (int i = 1; i <= 10; i++) {
        int resul = numero * i;
        System.out.println(numero + " x " + i + " = " + resul);

        }
    }

}