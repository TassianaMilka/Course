//Faltou a utilização do super.
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}