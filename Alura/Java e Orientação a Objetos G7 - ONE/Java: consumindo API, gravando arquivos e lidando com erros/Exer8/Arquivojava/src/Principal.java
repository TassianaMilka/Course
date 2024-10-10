//Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado
// "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote
// java.io.
import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        String data = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}