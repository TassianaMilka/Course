alert('Olá a todos esse é o primeiro exemplo de Javascript do jogo');

/*Os nomes precisa ser claro para compreender*/ 
/* Os número não é descrito com aspa pelo fato que é só utilizado para texto*/ 
let  numeroSecreto =5;
console.log(numeroSecreto);
let chute
/*let chute=prompt('Escolha um número entre 1 e 10');*/
/*Loop(Enquanto não é igual a 5)*/ 
while(chute!=numeroSecreto){

let chute=prompt('Escolha um número entre 1 e 10');

/*Condição*/ 

    if(chute==numeroSecreto){

    alert('Você descobiru o número secreto ${numeroSecreto} com ${tentativas} tentativas.');

    }else{
        if(chute>numeroSecreto){

        alert('O número secreto é menor  que ${chute}');

        }  else{

        alert('O número secreto é maior que ${chute}');
      }

     /* tentativa=tentativa+1;*/
      tentativas++;

    }
}

/*Aclopamento*/ 

/*Templete String*/ 

/*Live Sever*/ 

