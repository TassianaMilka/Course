//Crie uma classe Produto com atributos como nome, preco, e quantidade.
// Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
// Implemente o método toString() na classe Produto para retornar uma representação
//  em texto do objeto. Em seguida, imprima a lista de produtos utilizando o método
//System.out.println().Modifique a classe Produto para incluir um construtor que
// aceite parâmetros para inicializar os atributos. Em seguida, crie objetos Produto
//utilizando esse novo construtor.Crie uma classe ProdutoPerecivel que herde de Produto.
//Adicione um atributo dataValidade e um construtor que utilize o construtor da classe
//mãe (super) para inicializar os atributos herdados. Crie um objeto ProdutoPerecivel e
//imprima seus valores.

import java.util.ArrayList;
import dados.Produto;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();



        Produto produtodado=new Produto("Panela",30,1);
        produtodado.toString();

        listaProdutos.add(produtodado);

        System.out.println("Tamanho da lista= " + listaProdutos.size());
        System.out.println("Produto= " + listaProdutos.get(0).getNome());


    }


}