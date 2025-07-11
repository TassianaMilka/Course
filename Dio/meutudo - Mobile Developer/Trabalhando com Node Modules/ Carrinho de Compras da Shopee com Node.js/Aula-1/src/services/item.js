//Função que cria o item

async function createItem(name, price, quantity) {

return{

  name,
  price,
  quantity,
  subtotal:()=> price * quantity * 0.2,

};

}

export default createItem;

