

function calcularJurosSimples() {
  // Lê os valores de entrada
  const C = parseFloat(gets()); 
  const i = parseFloat(gets()); 
  const t = parseInt(gets());   

  // TODO: Calcule o montante com juros simples:
  

// TODO: Chame a função para calcular os juros simples:


 // Calcula o montante com juros simples
  const M = C * (1 + i * t);

  // Exibe o resultado do montante com 2 casas decimais
  print(`Montante: ${M.toFixed(2)}`);
}

// Chama a função para calcular os juros simples
calcularJurosSimples();
