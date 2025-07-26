//extract method
async function permittedCharacters() {
  let permitted = [];
//Validação de caracteres permitidos para a senha
  if (process.env.UPPERCASE_LETTERS === "true")
    permitted.push(..."ABCDEFGHIJKLMNOPQRSTUVWXYZ");

  if (process.env.LOWERCASE_LETTERS === "true")
    permitted.push(..."abcdefghijklmnopqrstuvwxyz");

  if (process.env.NUMBERS === "true") permitted.push(..."0123456789");

  if (process.env.SPECIAL_CHARACTERS === "true")
    permitted.push(..."!@#$%^&*()-_");
  
  //Retorno dos caracteres 
  return permitted;
}

//Exportação da função
export default permittedCharacters;