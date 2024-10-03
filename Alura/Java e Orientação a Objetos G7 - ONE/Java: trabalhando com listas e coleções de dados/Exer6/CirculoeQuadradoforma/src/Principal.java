//Crie uma interface Forma com um método calcularArea(). Implemente a
// interface em duas classes, por exemplo, Circulo e Quadrado. Em seguida
// crie uma lista de formas (objetos da interface Forma) e utilize um loop
// para calcular e imprimir a área de cada forma.


import dados.Circulo;
import dados.Quadrado;
import interfacedado.Forma;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Circulo circulo=new Circulo();
        circulo.setRaio(5);
        Quadrado quadrado=new Quadrado();
        quadrado.setLado(4);



        ArrayList<Forma> listaFormas = new ArrayList<>();

        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }

    }
}