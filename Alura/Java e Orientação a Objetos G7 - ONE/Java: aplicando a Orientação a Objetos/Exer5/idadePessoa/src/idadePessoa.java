public class idadePessoa {

    private String nome;
    private int idade;


    void exibir() {


        System.out.println("Nome e idade");

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }


  public void Maiorormenor(){

        if (idade > 18) {

            System.out.println("Já é maior de idade");

        } else if (idade < 18) {

            System.out.println("Não é maior de idade");
        }


    }
}
