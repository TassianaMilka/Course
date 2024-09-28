package dados;
public class Carro {

    private String nome;
    private double preco1;
    private double preco2;
    private double preco3;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco1(double preco1) {
        this.preco1 = preco1;
    }

    public void setPreco2(double preco2) {
        this.preco2 = preco2;
    }

    public void setPreco3(double preco3) {
        this.preco3 = preco3;
    }



    public String getNome() {
        return nome;
    }

    public double getPreco1() {
        return preco1;
    }

    public double getPreco2() {
        return preco2;
    }

    public double getPreco3() {
        return preco3;
    }


    public void exibir(){

        System.out.println("Nome do carro="+getNome());
        System.out.println("O primeiro preço="+getPreco1());
        System.out.println("O segundo preço="+getPreco2());
        System.out.println("O terceiro preço="+getPreco3());

    }

    public double calcularMenorPreco() {
        double menorPreco = preco1;

        if (preco2 < menorPreco) {
            menorPreco = preco2;
        }

        if (preco3 < menorPreco) {
            menorPreco = preco3;
        }

        return menorPreco;
    }

 public double calcularMaiorPreco() {
        double maiorPreco = preco1;

        if (preco2 > maiorPreco) {
            maiorPreco = preco2;
        }

        if (preco3 > maiorPreco) {
            maiorPreco = preco3;
        }

        return maiorPreco;
    }



}


