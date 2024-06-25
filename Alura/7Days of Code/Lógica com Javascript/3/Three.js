/*Seu desafio de hoje é criar os destinos possíveis de um jogo, em que o usuário consiga escolher:

1. Se quer seguir para área de Front-End ou seguir para a área de Back-End.

2. Caso esteja na área de Front-End, se quer aprender React ou aprender Vue. Caso esteja na área de Back-End, poderá aprender C# ou aprender Java.

3. Depois, independente das escolhas anteriores, o usuário poderá escolher entre seguir se especializando na área escolhida ou seguir se desenvolvendo para se tornar Fullstack. Você deve exibir na tela uma mensagem específica para cada escolha.

4. Por fim, pergunte quais são as tecnologias nas quais a pessoa gostaria de se especializar ou de conhecer. Aqui, a pessoa pode responder N tecnologias, uma de cada vez. Então, enquanto ela continuar respondendo ok para a pergunta: “Tem mais alguma tecnologia que você gostaria de aprender?”, continue apresentando para ela o Prompt, para que ela complete o nome da tecnologia em questão. E, logo depois, apresente uma mensagem comentando algo sobre a linguagem inserida.

O importante é que a pessoa que estiver jogando possa sempre escolher qual decisão tomar para conseguir aprender e se desenvolver na área de programação.

Além disso, também é essencial que, ao final do jogo, ela possa inserir quantas tecnologias quiser na lista de aprendizado.*/


let escolhe;
let escolhe1;
let escolhe2;
let escolha3= " ";
let escolha4=" ";

/*Parte 1*/
  escolhe = prompt("Qual é a  sua esclho para estudo e profissional Front-End-[1]ou seguir para a área de Back-End-[2]?\n");

if(escolhe==1){
    
    console.log(" Que legal escolheu Front- End ");
    
      escolhe1 = prompt("Escolhe React ou Vue para aprender\n");
    
    if(escolhe1==1){
           console.log(" Que legal  escolheu React para aprender.\n");
 
    }else{
        
            console.log("Que legal  escolheu Vue para aprender .");

    }
    console.log("\n");
    }else if(escolhe==2){
        
       console.log(" Que legal  escolheu Back- End nessa área poderá aprender C# ou Java.");
    }
    console.log("\n");
     /*Parte 2*/
  escolhe2 = prompt("Deseja seguir se desenvolvendo para se tornar Fullstack Sim[1] ou número aleatório para não.\n");

if(escolhe2==1){
  
   console.log("Que legal deseja ser profissonal como Fullstack.");  
}else{
        console.log("Ok, armazenado.");

}
console.log("\n");
  /*Parte 3*/
  escolhe3 = prompt("Quais são as tecnologias nas quais gostaria de se especializar ou de conhecer!\n");
     console.log(" Tudo bem na sua escolha armazenado="+escolhe3);
     console.log("\n");

escolhe4 = prompt(" Desja descrever mais especialização de tecnologia sim-[1] ou número aleatório para não.\n");
if(escolhe4==1){
      console.log("Armazenado os dados\n"+escolhe4) 

}else{
    
    console.log("Armazenado.");
}
 
console.log("\n");
console.log("Finalizado com sucesso.");
