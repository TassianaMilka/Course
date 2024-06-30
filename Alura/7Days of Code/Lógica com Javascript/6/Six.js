/*  Você deverá criar a opção de remover algum item da lista, que será exibida junto à pergunta de “você deseja adicionar uma comida na lista de compras”?

A partir daí, caso a pessoa escolha essa opção, o programa irá imprimir os elementos presentes na lista atual, e a pessoa deverá escrever qual deles deseja remover.

Depois disso, o programa irá remover o elemento da lista e imprimir a confirmação de que o item realmente não está mais lá.

Por fim, ele voltará para o ciclo inicial de perguntas.

Se, na hora de deletar o item, o mesmo não for encontrado na lista, você deverá exibir uma mensagem avisando isso.

Por exemplo: “Não foi possível encontrar o item dentro da lista!”   */


let escolher;
let des=1;
let escolher1 = [''];
let escolher2=1;
let escolher3 = [''];
let escolher4 = [''];
let escolherA;
let imprimir;

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

 escolherA= prompt("Informe 1-[Sim] e 2-[Não]\n");
if(escolherA==1){
let arr = ["Maça","Banana","Pera"];
let f =[""];
console.log("--------------Fruta-----------------");
f=prompt("Informa o que precisa ser retirado Maça Banana Pera\n ");
console.log(arr.shift(f)); 
console.log("Não foi possível encontrar o item dentro da lista!");
console.log("\n");
console.log(arr); 
     
let arr1 = ["Iogurte","Manteiga","Creme de leite"];
let f1 =[""];
console.log("--------------Laticínios-----------------");
console.log(arr1.shift(f1)); 
console.log("Não foi possível encontrar o item dentro da lista!");
console.log("\n");
console.log(arr1);  

let arr2 = ["Lasanha","Pizza","Sorvete"];
let f2 =[""];
console.log("--------------Congelados-----------------");
console.log(arr2.shift(f2)); 
console.log("Não foi possível encontrar o item dentro da lista!");
console.log("\n");
console.log(arr2);   


let arr3 = ["Chocolate","Leite","Suco"];
let f3 =[" "];
console.log("--------------Doce-----------------");
console.log(arr3.shift(f3)); 
console.log("Não foi possível encontrar o item dentro da lista!");
console.log("\n");
console.log(arr3);  
console.log("\n");

    
}else if(escolherA==2){
    /*imprimir*/
    console.log("Finalizado a lista sem nada!");
}
