//O uso da interface Tributavel permite que a classe CalculadoraImposto
//possa calcular os impostos de qualquer classe que a implemente, sem
//precisar conhecer a implementação específica de cada uma delas e
//nem todas as classes filhas de Item precisam implementar a interface
//Tributavel.

public class Item {

    private String nome;
    private double preco;

    // métodos getters e setters omitidos

}


public class Produto extends Item {

    private double peso;

    // métodos getters e setters omitidos

}

public class Servico extends Item {

    private int quantidadeHoras;

    // outros métodos da classe Servico

}
public class Brinde extends Item {

    private String justificativa;

    // métodos getters e setters omitidos

}
public interface Tributavel {

    double calculaImposto();

}
public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calculaImposto(Tributavel tributavel) {
        totalImposto += tributavel.calculaImposto();
    }

}
public class Produto extends Item implements Tributavel {

    private double peso;

    public double calculaImposto() {
        //produto tem 10% de imposto:
        return getPreco() * 0.1;
    }

    // métodos getters e setters omitidos

}
public class Servico extends Item implements Tributavel {

    private int quantidadeHoras;

    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }

    // outros métodos da classe Servico

}