
/*let titulo= document.querySelector('h1') 
titulo.innerHTML= 'Jogo do número secreto';*/

/*let paragrafo=document.querySelector('p')
paragrafo.innerHTML='Escolha um número entre 1 e 10';*/

let  numeroSecreto=gerarumNumeroAleatorio();

function exibirTextoNaTela(tag,texto){

let campo = document.querySelector(tag);
campo.innerHTML = texto;

}

exibirTextoNaTela('h1','Jogo de número secreto');
exibirTextoNaTela('p','Escolhe um número entre 1 e 10');

 function verificarcarChute(){

    /*console.log('O botão foi clicado!');*/
    let chute = document.querySelector('input').value;
    console.log(chute==numeroSecreto);

 }

function  gerarumNumeroAleatorio( ){

 return parseInt(Math.random()*10+1);


}