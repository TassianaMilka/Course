
/*O bug está na condição do if (senha = senhaDoSistema) o comparador de igualdades são dois e não um.*/ 

/*Erro*/ 
let senhaDoSistema = "senhaTeste!"; 

let senha = prompt("Digite a senha do sistema:");

if (senha = senhaDoSistema){ 
    alert("Acesso ao sistema garantido");
}


/*Certo*/ 
let senhaDoSistema = "senhaTeste!";

let senha = prompt("Digite a senha do sistema:");

if (senha == senhaDoSistema){
    alert("Acesso ao sistema garantido");
}


