//Desenvolva uma classe Produto com os atributos privados nome e preco.
//Utilize métodos getters e setters para acessar e modificar esses atributos.
//Adicione um método aplicarDesconto que recebe um valor percentual e reduz o
//preço do produto.

public class Main {
    public static void main(String[] args) {
        Produto cal = new Produto();
        cal.setNome("Mesa");
        cal.setPreco(120.00);
        cal.valor=12;

        System.out.println(cal.getNome());
        System.out.println(cal.getPreco());

        cal.aplicarDesconto();
        System.out.println("Novo Preço após Desconto: " + cal.getPreco());

    }
}