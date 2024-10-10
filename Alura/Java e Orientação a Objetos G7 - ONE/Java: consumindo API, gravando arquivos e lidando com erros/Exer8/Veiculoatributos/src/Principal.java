//Defina uma classe chamada Veiculo com os atributos necessários.
// Em seguida, crie um programa que instancia um objeto Veiculo,
// serializa esse objeto para JSON usando a biblioteca Gson e
// imprime o resultado.

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {


        Veiculo carro=new Veiculo("Uno", 2007);

        Gson gson = new Gson();
        String jsonVeiculo = gson.toJson(carro);


        System.out.println("Objeto Veiculo="+jsonVeiculo);


    }
}