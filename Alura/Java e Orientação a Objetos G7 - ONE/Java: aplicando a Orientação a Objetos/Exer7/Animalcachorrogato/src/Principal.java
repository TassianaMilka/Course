//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas
// subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o
// método emitirSom() nas subclasses, utilizando a anotação @Override para
//  indicar que estão sobrescrevendo o método. Além disso, adicione métodos
//  específicos para cada subclasse, como abanarRabo() para o Cachorro e
//  arranharMoveis() para o Gato.


import dados.Cachorro;
import dados.Gato;

public class Principal {
    public static void main(String[] args) {



        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();





    }
}