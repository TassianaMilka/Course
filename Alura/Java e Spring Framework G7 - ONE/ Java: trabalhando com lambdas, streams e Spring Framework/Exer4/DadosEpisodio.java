
/*Filtra corretamente os episódios pares e atende às necessidades do contexto.*/

for (DadosEpisodio episodio : dadosTemporada.episodios()) {
    if (episodio.numero() % 2 == 0) {
        System.out.println(episodio);
    }
}
