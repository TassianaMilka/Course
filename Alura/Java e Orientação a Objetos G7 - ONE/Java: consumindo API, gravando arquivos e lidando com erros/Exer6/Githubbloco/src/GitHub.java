//Desenvolva um programa em Java que permite aos usuários consultar informações
// sobre um usuário do GitHub (utilize a API pública do GitHub para obter os dados).
// Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende
// RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado.
// No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;

record Githubdado (String nome, String cidade) {}

public class GitHub {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);
            String jsonGithub = "{\"nome\":\"@tassianamilka\",\"cidade\":\"Campinas\"}";
            Gson gson = new Gson();
            Githubdado pessoa = gson.fromJson(jsonGithub, Githubdado.class);

            System.out.println("Objeto Pessoa: " + pessoa);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}