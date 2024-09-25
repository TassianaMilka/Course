//Desenvolva uma classe Aluno com os atributos privados nome e notas.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método calcularMedia que retorna a média das notas do aluno.
public class Main {
    public static void main(String[] args) {
        Aluno calnotaMedia = new Aluno();
        calnotaMedia.setNome("Tassiana Milka");
        calnotaMedia.setNota1(7.5);
        calnotaMedia.setNota2(9.5);



        System.out.println(calnotaMedia.getNome());
        System.out.println(calnotaMedia.getNota1());
        System.out.println(calnotaMedia.getNota2());

        calnotaMedia.calcularMedia();
        System.out.println(calnotaMedia.getMedia());




    }
}