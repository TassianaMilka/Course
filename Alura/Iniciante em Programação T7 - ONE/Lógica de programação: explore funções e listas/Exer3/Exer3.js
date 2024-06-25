/*Se o número for maior que zero, a mensagem deve ser: "O número é positivo."
Se o número for menor que zero, a mensagem deve ser: "O número é negativo."
Se o número for igual a zero, a mensagem deve ser: "O número é zero."*/


function verificarNumero(numero) {
  if (numero > 0) {
    console.log("O número é positivo.");
  } else if (numero < 0) {
    console.log("O número é negativo.");
  } else {
    console.log("O número é zero.");
  }
} 

