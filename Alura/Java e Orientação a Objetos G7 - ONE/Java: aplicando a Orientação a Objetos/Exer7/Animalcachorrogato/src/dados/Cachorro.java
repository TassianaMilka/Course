package dados;

import animal.Animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro Au Au");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abana o rabo");
    }
}