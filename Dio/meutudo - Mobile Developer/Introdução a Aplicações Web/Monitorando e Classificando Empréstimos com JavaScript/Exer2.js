// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.


function monitor() {
// Lê a quantidade de empréstimos
let loanCount = parseInt(gets());

// Lista para armazenar os empréstimos
let loans = [];

for (let i = 0; i < loanCount; i++) {
    loans.push(parseInt(gets()));
}

// Lê os limites e extrai os valores
let lowLimit = parseInt(gets().split(":")[1].trim());
let mediumLimit = parseInt(gets().split(":")[1].trim());

// Listas para classificar os empréstimos
let lowRisk = [];
let mediumRisk = [];
let highRisk = [];

// TODO: Classifique conforme os limites


for (let i = 0; i < loanCount; i++) {
     
      let nivel = loans[i]
        if (nivel<= lowLimit) {
            lowRisk.push(nivel);
        } else if (nivel <= mediumLimit) {
            mediumRisk.push(nivel);
        } else {
            highRisk.push(nivel);
        }
    }

// Impressão dos resultados
print("baixo: " + lowRisk);
print("medio: " + mediumRisk);
print("alto: " +  highRisk);

  // Função auxiliar para juntar os elementos da lista separados por vírgula
  function joinList(list) {
    return list.join(",");
  }

}

monitor();
