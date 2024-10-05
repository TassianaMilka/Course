//Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList
// quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é
// possível trocar facilmente a implementação.
//Modifique o Exercício 4 para declarar a variável de lista como a interface List,
//demonstrando o uso de polimorfismo.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


        public class Principal{
            public static void main(String[] args) {
                List<String> listaPolimorfica;
                //List<String> listaArrayList = new ArrayList<>();
                listaPolimorfica = new ArrayList<>();
                listaPolimorfica.add("Elemento 1");
                listaPolimorfica.add("Elemento 2");
                System.out.println("ArrayList: " + listaPolimorfica);

                listaPolimorfica = new LinkedList<>();
                listaPolimorfica.add("Elemento A");
                listaPolimorfica.add("Elemento B");
                System.out.println("LinkedList: " + listaPolimorfica);
            }
        }


