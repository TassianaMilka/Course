// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde:  
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário; 
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente. 

// Função para calcular a taxa mensal com base na taxa anual
function calcularTaxaMensal(iAnual) {
  
    // TODO: Calcule a taxa mensal usando a fórmula de juros compostos:
   
    const iMensal = Math.pow(1 + iAnual, 1 / 12) - 1;

    // TODO: Arredonda a taxa mensal para 4 casas decimais:
    const iMensalFormatado = iMensal.toFixed(4);

  // TODO: Exiba o resultado:
    print(`Taxa Mensal: ${iMensalFormatado}`);
}


// Lê a entrada usando gets()
let entrada = gets();

// TODO: Converta a entrada para número decimal:

let iAnual = parseFloat(entrada);


// Chama a função para calcular e exibir a taxa mensal
calcularTaxaMensal(iAnual);
