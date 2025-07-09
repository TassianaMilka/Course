//Declarar a variavéis e utilizar métodos  para acessar em outro arquivo

const {getFullname,producType}=require("./services/products");
const products= require("./services/products");


const config= require("./services/config");
const  database=require("./services/database");

//Função para o acesso principal do programa que o usuário visualiza

async function main(){
  
 console.log("carrinho compras");

getFullname("1","teclado");
products.getFullname("1","teclado");

console.log(producType);


  // product.getFullName("408", "mousepad");
  // product.getFullName("508", "mouse");
  // product.getProductLabel("mousepad");

  database.connectToDatabase("my-data");
}

main();