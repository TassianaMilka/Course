/*Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.*/
console.log("Boas-Vindas");


/* Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o console.log para exibir a mensagem "Olá, [seu nome]!" no console do navegador.*/


let nome="Tassiana";

console.log("Olá,"+nome);  

/*Crie uma variável chamada "nome" e atribua a ela o seu nome. Em seguida, utilize o alert para exibir a mensagem "Olá, [seu nome]!" .*/

let nome1="Tassiana";

alert("Olá,"+nome);



/*Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.*/



let valor1=2;
let valor2=3;
let resultado;

resultado=valor1+valor2;

console.log("O valor 1="+valor1);
console.log("O valor 2="+valor2);
console.log("O resultado de resultado="+resultado);



/*Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a subtração desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A diferença entre [valor1] e [valor2] é igual a [resultado]." no console.*/



let valor1=2;
let valor2=3;
let resultado;

resultado=valor1-valor2;

console.log("O valor 1="+valor1);
console.log("O valor 2="+valor2);
console.log("O resultado de resultado="+resultado);


/*Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior ou menor de idade, exibindo uma mensagem apropriada no console.*/



let idade=10;

let idade = prompt("Digite sua idade:"); 

if(idade>18){
    
    console.log(" A idade é maior que 18");
}

else if( idade<18){
    
    console.log(" A idade é menor que 18");
}











