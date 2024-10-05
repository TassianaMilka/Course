//Crie uma lista de números inteiros e utilize o método Collections.sort para
// ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(1);
        lista.add(3);
        //Crescente
        Collections.sort(lista);

        System.out.println("Lista ordenada" + lista);


    }
}