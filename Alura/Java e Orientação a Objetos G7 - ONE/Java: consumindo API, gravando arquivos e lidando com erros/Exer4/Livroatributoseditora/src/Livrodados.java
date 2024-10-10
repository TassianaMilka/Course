//Crie uma classe Livro que contenha atributos como título, autor e um objeto
// representando a editora. Em seguida, implemente um programa que utiliza a
// biblioteca Gson para converter um JSON aninhado representando um livro em
// um objeto do tipo Livro.
import com.google.gson.Gson;

record Editora(String nome) {}
record Livro(String titulo, String autor, Editora editora) {}

public class Livrodados{

        public static void main(String[] args) {

            String jsonLivro = "{\"titulo\":\"Name book\",\"autor\":\"Milka\",\"editora\":{\"nome\":\"Nowbook\"}}";

            Gson gson = new Gson();
            Livro livro = gson.fromJson(jsonLivro, Livro.class);

            System.out.println("Objeto Livro: " + livro);
        }
    }




