//O arquivo será salvo contendo o texto "Hello" e Será impresso no console o texto "Erro!".
public class ExemploArquivo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("arquivo");

            writer.write("Hello");
            writer.close();
            writer.write(" World!");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro!");
        }
    }
}