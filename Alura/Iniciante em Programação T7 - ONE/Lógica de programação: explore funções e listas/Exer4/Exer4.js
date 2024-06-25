/*Criar uma função que exibe "Olá, mundo!" no console.*/

function imprimirmensagem(){
   
    console.log("Olá, mundo!");
    
  
}

imprimirmensagem();


/*Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.*/

function imprimirmensagem(nome){

nome="Tassiana";

    console.log("Olá,"+nome);
    
  
}

imprimirmensagem();


/*Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.*/

function imprimirdobro(numero){

numero=2*7;

    console.log("O número dobro da multiplicação é="+numero);
    
  
}

imprimirdobro();


/*Criar uma função que recebe três números como parâmetros e retorna a média deles.*/

function imprimirmedia(media){

console.log(" O número da primeira prova foi 8");
console.log( " O número da segunda prova foi 5");
media=8+5/2;
   
console.log("O número dobro da multiplicação é="+media);
    
  
}

imprimirmedia();


/*Criar uma função que recebe dois números como parâmetros e retorna o maior deles.*/

function imprimirmaior(a,b){


return a > b ? a : b;


}
let numero;
numero=imprimirmaior(2,4);
console.log(numero);

imprimirmaior();

/*Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo.*/

function imprimirmultiplicar(multiplicar){

multiplicar=9*9;
   
console.log("O números multiplicados contém o resultado igual="+multiplicar);
    
  
}

imprimirmultiplicar();
