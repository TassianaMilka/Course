
//Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida,
// crie um objeto da classe Cachorro e faça o casting para a classe Animal.
//Modifique o Exercício 2 para incluir uma verificação usando instanceof para 
//garantir que o objeto seja do tipo correto antes de fazer o casting.

import dados.Animal;
import dados.Cachorro;
public class Principal {
    public static void main(String[] args) {

        Animal cachorro = new Animal();
        Animal animal = (Animal) cachorro;
        cachorro.setNome("Name");
        cachorro.setRaca("Puldo");
        cachorro.setAno(2);


        Cachorro animalcachorro=new Cachorro();
        animalcachorro.exibir();


        if (cachorro instanceof Cachorro) {
           System.out.println("O cachorro é um objeto em Orientação a Java");

        }else {
            System.out.println("O objeto não é um Cachorro.");
        }


    }
}