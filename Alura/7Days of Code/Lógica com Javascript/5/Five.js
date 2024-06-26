
/*Então hoje, para facilitar a sua ida ao supermercado, você deve criar um programa em Javascript que perguntará se você deseja adicionar uma comida na sua lista de compras, e você deve poder responder com sim ou não.

Em seguida, ele perguntará qual comida você deseja inserir, e você digitará o nome dela, como por exemplo batata.

Depois, ele deverá perguntar em qual categoria essa comida se encaixa, com algumas opções já pré-definidas, como frutas, laticínios, congelados, doces e o que mais você achar interessante. Assim, você poderá separar tudo no seu devido grupo.

Por fim, caso você não queira mais adicionar nada na lista de compras e responder não na primeira pergunta, ele irá exibir uma lista com todos os itens agrupados*/

let escolher;
let des=1;
let escolher1 = [''];
let escolher2=1;
let escolher3 = [''];
let escolher4 = [''];


 escolher= prompt("Informe  se sim-[1] e não-[2]=\n");
if(escolher==1){
    /*Imprimir*/
    console.log("Vamos a lista !");
   
    escolher1= prompt("Qual comida deseja anexar=\n");
     escolher2=prompt("Em que categoria  ela é classificada 1-frutas,2-laticínios, 3-congelados e 4-doces=\n");
     
     if(escolher2==1 || escolher2==2){
         
        escolher3=prompt("Informa de forma escrita a categoria=\n"); 
    console.log("\n\n");
    console.log("O nome da categoria e comida\n"+escolher3);
    console.log("\n"+escolher1);
   
     }
      else if(escolher2==3 || escolher2==4){
         
         escolher4=prompt("Informa de forma escrita a categoria=\n");
    console.log("\n\n");
    console.log("O nome da categoria e comida\n"+escolher4);
    console.log("\n"+escolher1);
    
     } 
  
}else if(escolher==2){
    /*Loop*/
     while(des==1){   
console.log("Ok,tenha uma boa compra no supermecado não esqueça que alimentar corretamente não é  comer demais e nem comer muito pouco.");
    des++;
}

}
