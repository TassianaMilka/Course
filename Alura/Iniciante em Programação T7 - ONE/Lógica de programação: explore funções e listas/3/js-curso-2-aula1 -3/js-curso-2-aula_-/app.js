
/*let titulo= document.querySelector('h1') 
titulo.innerHTML= 'Jogo do número secreto';*/

/*let paragrafo=document.querySelector('p')
paragrafo.innerHTML='Escolha um número entre 1 e 10';*/

let  numeroSecreto=gerarumNumeroAleatorio();
let tentativas=1;
function exibirTextoNaTela(tag,texto){

let campo = document.querySelector(tag);
campo.innerHTML = texto;

}

function exibirMensagemInicial( ){

exibirTextoNaTela('h1','Jogo de número secreto');
exibirTextoNaTela('p','Escolhe um número entre 1 e 10');

} 

exibirMensagemInicial();

 function verificarcarChute(){

    /*console.log('O botão foi clicado!');*/
    let chute = document.querySelector('input').value;
    if(chute==numeroSecreto){

      exibirTextoNaTela('h1','Acertou');
      let palavraTentativa= tentativas>1 ?' tentativas ' : 'tentativa';
      let mensagemTentativas= 'Você descobriu o número secreto com ${tentativas} ${palavraTentativa}';
      exibirTextoNaTela('p ',mensagemTentativas);
      document.getElementById('reiniciar').removeAttribute('disabled');

    } else {

        if(chute > numeroSecreto){
         exibirTextoNaTela('p','O número secreto é menor');
    }else{

      exibirTextoNaTela('p','O número secreto é maior');
    }

    /*tentativas= tentativas+1;*/
    tentativas ++;
    limparCampo();
   }
    

 }

function  gerarumNumeroAleatorio(){

 return parseInt(Math.random()*10+1);


} 


function limparCampo(){

   chute= document.querySelector(' input');
   chute.value= '';
   
}

function reiniciarJogos(){

     numeroSecreto=gerarumNumeroAleatorio();
     limparCampo();
     tentativas=1;
     exibirMensagemInicial();
     document.getElementById('reiniciar').setAttribute('disabled',true);
}

/*JavaScript não é chipado.*/ 