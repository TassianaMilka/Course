

/*- Qual o seu nome?
- Quantos anos você tem?
- Qual linguagem de programação você está estudando?*/


let nome;
let idade;
let linguagem;

("Informe o seu nome");

("Informe a sua idade");

("Informe a linguagem de programção que gosta");


alert("Olá [nome], você tem [idade] anos e já está aprendendo [linguagem]!");


/*Você gosta de estudar [linguagem]? Responda com o número 1 para SIM ou 2 para NÃO.*/

E aí, dependendo da resposta, ele deve mostrar uma das seguintes mensagens:

1 > Muito bom! Continue estudando e você terá muito sucesso.
2 > Ahh que pena... Já tentou aprender outras linguagens?*/



let linguagem="Javascript";
let programar=1;

console.log("Você gosta de estudar [linguagem]?");


if(programar==1){
    console.log("Muito bom! Continue estudando e você terá muito sucesso.");

    
    }else if(programar==2){
        
        console.log("Ahh que pena... Já tentou aprender outras linguagens?");

        
    }
