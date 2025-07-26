// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.




// Lê a idade do cliente
const age = parseInt(gets());


// Função que classifica a idade para oferta de crédito
function classifyAgeForCredit(age) {
    if (age < 18) {
        return "Menor de idade - sem elegibilidade";
    } else if (age <= 35) {
        return "Jovem";
    } else if (age <= 64) {
        return "Adulto";
    } else {
        return "Idoso";
    }
}


print(classifyAgeForCredit(age));
