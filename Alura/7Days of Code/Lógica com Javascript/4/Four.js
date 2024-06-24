/*Você deve criar um programinha que comece com um valor específico pré-definido entre 0 a 10 para o número que você vai adivinhar (7, por exemplo).

Em seguida, o programa vai perguntar para você qual o valor que você deseja chutar e, caso você acerte, ele irá te parabenizar. Caso erre, ele vai te dar mais 2 tentativas.

No fim, caso você não acerte nenhuma vez, ele vai imprimir qual era o número inicial.*/



const numero = 8;
let chute;
let acertou = false;

for(let contador = 0; contador < 3; contador++){    
    chute = prompt("Tente adivinhar o número de 0 a 10:");
    if(chute == numero){
      console.log("Parabéns, você acertou! O número era="+ numero);
       acertou = true;
        break;
    }
}
 
if(!acertou){
   console.log ("Infelizmente, você não acertou. O número era="+numero);

}

console.log("Finalização");


/*2*/

