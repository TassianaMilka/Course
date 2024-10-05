// Crie uma lista de números inteiros e utilize o método Collections.sort para-la
//em ordem crescente. Em seguida, imprima a lista ordenada.
//Crie uma classe Titulo com um atributo nome do tipo String.
// Implemente a interface Comparable na classe para que seja
// possível ordenar uma lista de objetos Titulo.

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Titulo> lista= new ArrayList<>();



        lista.add(new Titulo("Titulo-2"));
        lista.add(new Titulo("Titulo-1"));
        lista.add(new Titulo("Titulo-1"));


        Collections.sort(lista);

        for (Titulo titulo : lista) {
            System.out.println(titulo.nome);
        }

        }
}