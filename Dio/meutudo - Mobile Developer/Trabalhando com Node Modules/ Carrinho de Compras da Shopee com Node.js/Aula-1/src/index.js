//Realizar a importação

import * as  cartService  from './services/cart,js'; 
import createItem from './services/item.js';

const cart =[];
const myWhishList=[];

//Imprimir 
console.log("Hello,welcome Shoppe!");


//Declarar os dados do carrinho
const item1=  await createItem("Samsung Galaxy S23",3000,1);
const item2= await createItem("Motorla Edge 40",1500,2);


/*await cartService.addItem(cart,item1);
await cartService.addItem(myWhishList,item2);*/

//Adicionando os itens ao carrinho que estão na lista

await cartService.addItem(myCart,item1);
await cartService.addItem(myCart,item2);

//Deletando o item do carrinho
await cartService.addItem(cart,item1.name);
await cartService.addItem(myWhishList,item2.name);


await cartService.calculateTotal(myCart,item2);

await cartService.removeItem(myCart)

await cartService.calculateTotal(myCart);


/*console.log(item1.subtotal());
console.log(item2.subtotal());*/




