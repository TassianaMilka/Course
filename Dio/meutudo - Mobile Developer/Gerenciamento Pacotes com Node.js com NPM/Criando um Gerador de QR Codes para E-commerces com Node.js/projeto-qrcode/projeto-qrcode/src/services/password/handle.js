
//Importar as funções da pasta utils
import permittedCharacters from "./utils/permitted-characters.js";

//Função para gerar senha 
async function handle() {
  let characters = [];
  let password = "";

  const passwordLength = process.env.PASSWORD_LENGTH;
  characters = await permittedCharacters();

  //Laço de verificação para garantir a senha
  for (let i = 0; i < passwordLength; i++) {
    const index = Math.floor(Math.random() * characters.length);
    password += characters[index];
  }

  //Retornar a senha
  return password;
}

//Exportar a função
export default handle;