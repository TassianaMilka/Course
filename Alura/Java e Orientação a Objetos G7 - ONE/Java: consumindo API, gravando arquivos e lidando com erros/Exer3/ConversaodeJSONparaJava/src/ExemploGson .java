//O código vai executar sem nenhum erro e gerar uma saída no console.
public class ExemploGson {
    public static void main(String[] args) {
        String json = """
          {
            "nome" : "João",
            "idade" : 30,
            "email" : "joao@email.com"
          }
        """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa.getIdade());
    }
}