// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

function monitor() {
    let loanCount = parseInt(gets());

    let urgent =[];
    let observation = [];
    let noUrgency = [];

    //Leia os valores dos dias restantes para cada empréstimo


for (let i = 0; i < loanCount; i++) {
      let day = parseFloat(gets());
        if (day<= 5) {
            urgent.push(day);
        } else if (day <= 15) {
            observation.push(day);
        } else {
            noUrgency.push(day);
        }
    }

   // Formata uma lista como string separada por vírgulas
    function formatList(list) {
        return list.join(',');
    } 

    // Exibe os resultados agrupados
    print("urgente: " + urgent);
    print("observacao: " + observation);
    print("sem_urgencia: " + noUrgency);
}

// Chamada da função principal
monitor();
