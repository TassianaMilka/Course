package dados;

import animal.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranha móveis");
    }
}
