/* A pontuação é corretamente definida como um atributo para cada nível no enum. O enum tem um construtor que permite atribuir um
valor a este atributo.*/

public enum Nivel {
    Iniciante(1), 
    Intermediario(2), 
    Avancado(3);
    
    private int pontuacao;
    Nivel(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
