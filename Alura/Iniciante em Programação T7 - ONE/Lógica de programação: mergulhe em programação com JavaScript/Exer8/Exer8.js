/*Inclua comandos console.log em diferentes partes do código para verificar o fluxo do programa*/

/*1*/

alert('Bem-vindo ao jogo do número secreto');
Console.log('Vamos lá pessoal');
let chute = prompt('Escolha um número entre 1 e 10');

let numeroSecreto = 4
Console.log('O resultado é =)')
console.log(chute == numeroSecreto) 
if (chute == numeroSecreto) {
    alert('Acertou')
} else {
    alert('O número secreto era ' + numeroSecreto);
}

Cosnole.log('Até próxima') ;

/*2*/

alert('Boas vindas ao jogo do número secreto');

Console.log( 'Vamos lá pessoal não esqueça das regras do jogo');
let chute = prompt('Escolha um número entre 1 e 10');
console.log('Valor do chute:', chute);

let numeroSecreto = 4;


console.log('Estejam preparados=)');
console.log('Resultado da comparação:', chute == numeroSecreto);

if (chute == numeroSecreto) {
    alert('Acertou');
} else {
  console.log('Valor do número secreto:', numeroSecreto);

    alert('O número secreto era ' + numeroSecreto);
} 
console.log('Até a próxima partida!');
