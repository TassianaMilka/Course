//Crie uma classe Produto com propriedades como nome e preço.
// Em seguida, crie uma lista de produtos e utilize um loop
// para calcular e imprimir o preço médio dos produtos.

import dados.Produto;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {

       Produto dadoproduto=new Produto("Mesa",100.00);
       Produto dadoproduto1=new Produto("Cadeira" ,50.00);

       System.out.println("Nome do Produto="+dadoproduto.getNome());
       System.out.println("O preço do Produto="+dadoproduto.getPreco());


        System.out.println("Nome do Produto="+dadoproduto1.getNome());
        System.out.println("O preço do Produto="+dadoproduto1.getPreco());

        ArrayList<Produto> listaProdutos = new ArrayList<>();


        listaProdutos.add(dadoproduto);
        listaProdutos.add(dadoproduto1);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio= " + precoMedio);
    }

    }
