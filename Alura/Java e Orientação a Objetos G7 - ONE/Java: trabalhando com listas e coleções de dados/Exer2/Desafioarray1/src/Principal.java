
import pessoasdados.dados.DadonomeIdade1;
import pessoasdados.dados.DadonomeIdade2;
import pessoasdados.dados.DadonomeIdade3;
import pessoasdados.pessoa.Pessoa;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {


        ArrayList<DadonomeIdade1> listaDePessoasdois = new ArrayList<>();
        ArrayList<DadonomeIdade2> listaDePessoastres = new ArrayList<>();
        ArrayList<DadonomeIdade3>listaDePessoasquatro = new ArrayList<>();

        DadonomeIdade1 nomeIdade1 = new DadonomeIdade1();
        nomeIdade1.setNome1("Nameone");
        nomeIdade1.setIdade1(25);

        DadonomeIdade2 nomeIdade2 = new DadonomeIdade2();
        nomeIdade2.setNome2("Nametwo");
        nomeIdade2.setIdade2(24);

        DadonomeIdade3 nomeIdade3 = new DadonomeIdade3();
        nomeIdade3.setNome3("Dm");
        nomeIdade3.setIdade3(2);



        listaDePessoasdois.add(nomeIdade1);
        listaDePessoastres.add(nomeIdade2);
        listaDePessoasquatro.add(nomeIdade3);

        System.out.println("Tamanho da lista " + listaDePessoasdois.size());
        System.out.println("Primeiro= " + listaDePessoasdois.get(0));
        System.out.println("Segundo= " + listaDePessoastres.get(0));
        System.out.println("Terceiro= " + listaDePessoasquatro.get(0));

    }



}