public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    void calcularMedia(){

       media=nota1+nota2/2;

    }

}
