
/*Loop infinito*/

let qtdNumeros = prompt('Digite a quantidade de números para o cálculo da média:');
let soma = 0;
let contador = qtdNumeros;

while(contador > 0){
    let numero = parseInt(prompt('Digite o numero:'));
    soma += numero;
}

let media = soma / qtdNumeros;

console.log(media);

/* Colocar na linha 11 o contatot -- pelo fato ele vai decrementar o contador a cada iteração,ou seja o zero(0) é positivo e precisa encontrar até o final. */

let qtdNumeros = prompt('Digite a quantidade de números para o cálculo da média:');
let soma = 0;
let contador = qtdNumeros;

while(contador > 0){
    let numero = parseInt(prompt('Digite o numero:'));
    soma += numero;

   contator--;
}

let media = soma / qtdNumeros;

console.log(media);
