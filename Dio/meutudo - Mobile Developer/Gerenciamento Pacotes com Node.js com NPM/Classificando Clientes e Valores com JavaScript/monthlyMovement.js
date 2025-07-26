// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const monthlyMovement = parseInt(gets());

// Função para classificar clientes fintech por movimentação mensal
function classifyFintechClient(monthlyMovement) {
  
  
    if (monthlyMovement<0){
      
       return "Valor invalido";
    }
    else if (monthlyMovement< 2000) {
        return "Basic";
    } else if (monthlyMovement <=8000) {
        return "Plus";
    } else if (monthlyMovement<=25000) {
        return "Premium";
    } else {
        return "Private";
    }
}



// Imprime o Resultado
print(classifyFintechClient(monthlyMovement));
