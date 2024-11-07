
/* um stream e utilizamos duas vezes o método filter, uma para pegar somente filmes lançados em 2022 e outra para filtrar os 
filmes de acordo com os critérios determinados. Depois utilizamos o sorted para ordenar pela avaliação de forma decrescente e
então utilizamos o método limit para limitar a lista em 10 filmes.Por fim, utilizamos a operação final forEach para imprimir 
os dados do filme.*/

public class Filme {
    private String titulo;
    private Integer totalVisualizacao;
    private Double avaliacao;
    private Integer anoLancamento;
    
    //getter, setters e toString() omitidos
}


filmes.stream()
                .filter(filme -> filme.getAnoLancamento()  == 2022)
                .filter(filme -> filme.getTotalVisualizacao() >= 10000 && filme.getAvaliacao() >= 9.4)
                .sorted(Comparator.comparingDouble(Filme::getAvaliacao).reversed())
                .limit(10)
                .forEach(System.out::println);
