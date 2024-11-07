/* Ela recebe uma função lambda como parâmetro e atua sobre cada elemento da stream, neste caso imprimindo-os. 
A operação 'collect' transforma a stream de volta em uma lista.*/

pets.stream()
    .peek(System.out::println)
    .collect(Collectors.toList());
