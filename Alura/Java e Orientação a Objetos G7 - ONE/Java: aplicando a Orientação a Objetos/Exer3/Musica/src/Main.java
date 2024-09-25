//Crie uma classe Musica com atributos titulo, artista, anoLancamento, 
//avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar
//a música e calcular a média de avaliações.
public class Main {
    public static void main(String[] args) {
      Musica mus = new Musica();
       mus. titulo="Sorrynotname";
       mus.artista="Name";
       mus.anoLancamento=2024;
       mus.numAvaliacoes =8;


        mus.exibir();

        mus.avaliar(7.0);
        mus.avaliar(6.5);
        mus.avaliar(10.0);


        System.out.println(mus.media());

    }
}
