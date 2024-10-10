//Modifique o programa anterior para que o JSON gerado seja formatado de maneira
// mais elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Titulosecundario(String nome) {}

public class PrincipalSecundaria {


    public static void main(String[] args) {

        String jsonTitulo = "{\"nome\":\"Text\"}";

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonTitulo);

        System.out.println(json);
    }

}
