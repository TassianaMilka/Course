//Defina uma classe chamada Titulo com os atributos necessários. Em seguida,
// crie um programa que instancia um objeto Titulo, serializa esse objeto para
// JSON usando a biblioteca Gson e imprime o resultado.


import com.google.gson.Gson;

record Titulo(String nome) {}

public class Principal {
    public static void main(String[] args) {

        String jsonTitulo = "{\"nome\":\"Text\"}";


                Gson gson = new Gson();
                String json = gson.toJson(jsonTitulo);

                System.out.println(json);
    }

}