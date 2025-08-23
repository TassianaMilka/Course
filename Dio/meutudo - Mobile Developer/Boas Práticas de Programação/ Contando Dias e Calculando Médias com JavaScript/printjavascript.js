// Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

function calculateLoanAverage() {
  // Lê a primeira linha que contém a quantidade de empréstimos (N)
  const N = parseInt(gets());

  // Inicializa a variável que vai armazenar a soma dos valores
  let sum = 0;

  // Loop para ler cada valor dos empréstimos
  for (let i = 0; i < N; i++) {
    // Lê o valor do empréstimo atual e converte para número decimal
    const value = parseFloat(gets());

    // TODO: Adicione o valor à soma total
    sum += value;
  }

  // TODO: Calcule a média dividindo a soma pelo número de empréstimos
  const average =sum / N ;

  // TODO: Imprima a média formatada com 2 casas decimais
  print(average.toFixed(2));
}

// Chama a função para executar o cálculo
calculateLoanAverage();
