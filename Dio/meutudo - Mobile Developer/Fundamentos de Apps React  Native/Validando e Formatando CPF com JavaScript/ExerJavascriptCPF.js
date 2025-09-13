


const valor = gets()

function validarCPF(cpf) {

  cpf = cpf.replace(/\D/g, '');
  
  if(cpf.length !== 11){
    
   return false;
   
  }
  
  if((/^(/d)\1{10}$/.test(cpf))){
    
    
   return false;
   
  }
  
  if(cpf.endsWith("00")){
    
    
  return false;
  
  }
  
  return true;
  
}


print(validarCPF(valor));
