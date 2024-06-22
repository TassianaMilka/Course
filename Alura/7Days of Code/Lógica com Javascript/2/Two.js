

/*- Qual o seu nome?
- Quantos anos você tem?
- Qual linguagem de programação você está estudando?*/


let nome;
let idade;
let linguagem;

let nome=prompt("Informe o seu nome");

let idade=prompt("Informe a sua idade");

let linguagem=prompt("Informe a linguagem de programção que gosta");


alert("Olá"+nome",você tem"+idade "anos e já está aprendendo"+linguagem);



/*Você gosta de estudar [linguagem]? Responda com o número 1 para SIM ou 2 para NÃO.

E aí, dependendo da resposta, ele deve mostrar uma das seguintes mensagens:

1 > Muito bom! Continue estudando e você terá muito sucesso.
2 > Ahh que pena... Já tentou aprender outras linguagens?*/



let linguagem="Javascript";
let programar=1;

console.log("Você gosta de estudar"+linguagem);


if(programar==1){
    console.log("Muito bom! Continue estudando e você terá muito sucesso.");

    
    }else if(programar==2){
        
        console.log("Ahh que pena... Já tentou aprender outras linguagens?");

        
    }
/*Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, armazene a resposta em uma variável e mostre no console do navegador.*/


let linguagem="Javascript";


let linguagem=prompt("Qual a linguagem de programação que você mais gosta?);

console.log("Você gosta de estudar"+linguagem);




