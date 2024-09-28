//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular
// e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro
// para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar
// informações.

import dados.Carro;


public class Principal{
    public static void main(String[] args){
       Carro car=new Carro();

       car.setNome("Uno");
       car.setPreco1(900000);
       car.setPreco2(1000000);
       car.setPreco3(800000);

       car.exibir();

       car.calcularMenorPreco();
       car.calcularMaiorPreco();

        System.out.println(car.calcularMenorPreco());
        System.out.println(car.calcularMaiorPreco());
    }
}