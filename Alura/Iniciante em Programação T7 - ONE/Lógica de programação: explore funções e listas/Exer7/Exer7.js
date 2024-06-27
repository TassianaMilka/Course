/*Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.*/


function calculaIMC(peso,altura){

imc = 56 / (1.90* 1.90);

}
calculaIMC();
console.log("\n" +imc);


/*Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.*/

function Fatorialnum(n,fatorial,num ){
  console.log(" Multiplicado pelo número 5\n");
}
let n;
let fatorial=1;
let num=5;
  /*Laço de repetição*/
   for(n = 1; n<= 5; n++) {
       /*Multiplicação*/
        fatorial*=n;
   }
 /*Imprimir*/
 console.log("Fatorial\n"+num, fatorial);
Fatorialnum();

/*Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.*/

function Dolar( reais){
    
}
let valor;
 /*Informar*/
 valor=prompt("Informa o valor=\n");
  valorConvertido = valor * 4.80;
  /*Imprimir*/
console.log("Valor convertido de dolar para real: R$%"+ valorConvertido);
Dolar();


/*-Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.*/

function Areaperimetro(altura,largura){
    /*Imprimir*/
    console.log("Área e Perimetro");
    
}
let altura = 4; 
let largura = 5; 
/*Realizar multiplicação*/
 let area = altura * largura;
 let perimetro = 2 * (altura + largura);
   console.log("Área da sala-"+area);
  console.log("Perímetro da sala-"+perimetro);

Areaperimetro();

/*Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.*/

function Areaperimetro(altura,largura){
    /*Imprimir*/
    console.log("Área e Perimetro");
    
}
let raio =4;
/*Realizar multiplicação*/
 let area = 3.14* raio* raio;
 let perimetro = 2* 3.14 * raio;
 /*Imprimir*/
   console.log("Área-"+area);
  console.log("Perímetro-"+perimetro);

Areaperimetro();


