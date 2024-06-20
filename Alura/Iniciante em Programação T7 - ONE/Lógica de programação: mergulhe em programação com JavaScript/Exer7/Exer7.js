/*Desenvolvimento de milha*/

/*Exemplo*/
let porcentagemDesconto = 0;

if(quantidadeMilhas > 5000){
    porcentagemDesconto = porcentagemDesconto + 10;
} 

if(quantidadeMilhas >= 30000){
    porcentagemDesconto = porcentagemDesconto + 20;
} else {
    porcentagemDesconto = 0;
}
/*Para o funcionamento da forma certa*/
/* Mudança*/
/* O if dentro do else é uma forma encadeada  que realiza o desconto conforme a quantidade*/
let porcentagemDesconto = 0;

if(quantidadeMilhas >= 30000){
    porcentagemDesconto = porcentagemDesconto + 20;
} else {
    if(quantidadeMilhas > 5000){
    porcentagemDesconto = porcentagemDesconto + 10;
}

}
