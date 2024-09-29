//A classe Gato não pode herdar da classe Cachorro  e Um objeto do
// tipo Animal pode ser instanciado e fazer barulho, mas não é possível
// chamar o método buscarOsso.


public class Animal {

    private String nome;
    private double peso;

    public void fazerBarulho() {
        System.out.println("fazendo barulho!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

public class Cachorro extends Animal {

    @Override
    public void fazerBarulho() {
        System.out.println("Au au au!");
    }

    public void buscarOsso() {
        System.out.println("Buscando o osso!");
    }
}

public class Gato extends Animal {

    public void brincarComLaser() {
        System.out.println("Brincando com o laser!");
    }
}