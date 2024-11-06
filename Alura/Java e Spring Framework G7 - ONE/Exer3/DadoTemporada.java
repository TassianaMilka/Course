/*Buscar todas as temporadas de uma série específica.*/

List<DadosTemporada> temporadas = new ArrayList<>();
for(int i = 1; i <= dadosSerie.totalTemporadas(); i++) {
    json = consumoApi.obterDados("https://www.omdbapi.com/?t="+ serie + "&season=" + i + "&apikey=6585022c");
    DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
    temporadas.add(dadosTemporada);
}

temporadas.forEach(System.out::println);
