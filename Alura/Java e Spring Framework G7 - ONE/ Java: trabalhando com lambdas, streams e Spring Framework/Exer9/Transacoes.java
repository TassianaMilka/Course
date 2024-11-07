/*Ele filtra as transações com valores superiores a 5000, imprime um registro de cada uma com o método peek, coleta os resultados
em um Set e retorna o primeiro elemento do Set.*/

transacoes.stream()
 .filter(t -> t.getValor() > 5000)
 .peek(System.out::println)
 .collect(Collectors.toSet()).stream()
 .findFirst();
