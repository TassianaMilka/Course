/* crie a sua própria calculadora, porém com um detalhe muito importante: cada operação deverá ser uma função diferente no seu código.

Primeiramente, a pessoa deverá escolher uma opção de operação impressa pelo programa na tela.

Depois, ela deverá inserir os dois valores que deseja utilizar, e o programa imprimirá o resultado da operação em questão.

As opções disponíveis deverão ser: soma, subtração, multiplicação, divisão, e sair. Nessa última, o programa deverá parar de ser executado, mostrando uma mensagem "Até a próxima".*/



let escolheSN='s';
let escolher;
let mensagem="Até a próxima :)";


while(escolheSN=='s'){
  escolher= prompt("Informe se deseja realizar uma operação de: \nAdição-[1]\nSubtração-[2]\nMultiplicação-[3]\nDivisão-[4]\n");


if(escolher==1){
    
    function Adicao(resultado){
     

    }
    Adicao();
   
 
   informe1 = prompt("Informe o primeiro número\n");
   informe2= prompt("Informe o segundo número\n");
   /*Realizar a soma*/
   resultado=informe1+informe2;
   /*Imprimir  o resultado da função*/
   console.log("O resultado da soma\n");
   console.log(resultado);

   
   }if(escolher==2){
       
       function Subtracao(resultado){
     
 

    }
  Subtracao();
   
 
   informe1 = prompt("Informe o primeiro número\n");
   informe2= prompt("Informe o segundo número\n");
      /*Realizar a subtração*/
   resultado=informe1-informe2;
      /*Imprimir  o resultado da função*/
      console.log("O resultado da subtração\n")
   console.log(resultado);

       
   }if( escolher==3){
       
       function Multiplicacao(resultado){
     
 

    }
    
 Multiplicacao();
   
 
   informe1 = prompt("Informe oo primeiro número\n");
   informe2= prompt("Informe o segundo número\n");
      /*Realizar a multiplicação*/

   resultado=informe1*informe2;
      /*Imprimir  o resultado da função*/
    console.log("O resultado da multiplicação\n");
   console.log(resultado);
   
   }else if(escolher==4){
       
       function Divisao(resultado){
     
 
    }
    
  Divisao();
   
 
   informe1 = prompt("Informe o primeiro número\n");
   informe2= prompt("Informe o segundo número\n");
   /*Realizar a divisão*/
   resultado=informe1/informe2;
      /*Imprimir  o resultado da função*/
   console.log("O resultado da divisão\n");
   console.log(resultado);
   }
   
   break;
}

  /* Imprimir a mensagem da string*/
    console.log(mensagem);

   
   
   
   
