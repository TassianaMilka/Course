
//Função que adiciona o item ao carrinho

async function addItem(userCart ,item) {
  
userCart.push(item);


}


//Função para cacular o total 

async function calculateTotal(userCart){

  console.log("Shopee Cart!");
 //O valor interior e o valor inicial
  const  totalResultado= userCart.reduce((total,item)=>total+item.subtotal(),0);
  console.log(totalResultado);

}

//Função que delete o item ao carrinho

async function deleteItem(userCart, name){

  //Guardar o index do item que queremos deletar pelo nome
  const index= userCart.findIndex((item)=>item.name===name);
 
  if(index===-1){

    userCart.splice(index,1);
  }

}

//Função que remove o item ao carrinho

async function removeItem(userCart, index) {

  const  deleteItem = index -1;

if(index >0 && index < userCart.length){

userCart.splice(index,1);

   }

} 

//Função secundária que remove o item do carrinho

async function removeItem(userCart, index) {

   //Procurar o item pelo indice
   const indexFound  = userCart.findIndex((p)=> p.name === item.name);

   
   //Caso não encontra o item 
  
   if(indexFound ===-1){

      console.log("Item não encontrado");
      return;

   }

    //Se é maior que 1 ele vai remover o item
   if(userCart[indexFound].quantity>1){

    userCart[indexFound].quantity-=1;

      return;

   }

   if(userCart[indexFound].quantity===1){

    userCart.splice(indexFound,1);

    return;


   }


}





//Função que remove o item ao carrinho
async function displayCart(userCart) {

  
    console.log("Shopee cart list");
    userCart.forEach((item,index)=>{

      console.log(`${index+1}. ${item.name}-R$ ${item.price} | ${item.quantity}| subtotal ${item.subtotal()}`);
   


    });
  

}


export{
  addItem,
  calculateTotal,
  deleteItem,
  removeItem,
}