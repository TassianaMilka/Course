public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double  avaliacao;
    int numAvaliacoes;


    void exibir() {

        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(numAvaliacoes);
    }

    void avaliar(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }
double media(){

    return  avaliacao / numAvaliacoes;

    }
}