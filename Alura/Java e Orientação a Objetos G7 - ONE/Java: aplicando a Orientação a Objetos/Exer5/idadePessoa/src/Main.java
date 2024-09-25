
//Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos
//getters e setters para acessar e modificar esses atributos. Adicione um método
//verificarIdade que imprime se a pessoa é maior de idade ou não.

public class Main {
    public static void main(String[] args) {
        idadePessoa nomeIdade = new idadePessoa();

        nomeIdade.exibir();

        nomeIdade.setNome("Tassiana Milka");
        nomeIdade.setIdade(21);


        System.out.println(nomeIdade.getNome());
        System.out.println(nomeIdade.getIdade());

        nomeIdade.Maiorormenor();

    }
}