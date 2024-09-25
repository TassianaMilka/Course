//Desenvolva uma classe Livro com os atributos privados titulo e autor.
//Utilize métodos getters e setters para acessar e modificar esses atributos.
//Adicione um método exibirDetalhes que imprime o título e o autor do livro.
public class Main {
    public static void main(String[] args) {
        Livro dadoLivro=new Livro();
        dadoLivro.setTitulo("Name book");
        dadoLivro.setAutor("Name");

        dadoLivro.exibirDetalhes();
    }
} 
