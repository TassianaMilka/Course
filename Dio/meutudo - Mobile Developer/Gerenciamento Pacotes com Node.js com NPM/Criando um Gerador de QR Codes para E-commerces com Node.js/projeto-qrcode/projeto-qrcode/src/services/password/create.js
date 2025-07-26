//Importar a função handle
import chalk from "chalk";
import handle from "./handle.js";


//Função para criar a senha
async function createPassword() {
  console.log(chalk.green("password"));
  const password = await handle();
  console.log(password);
}

//Exportar a função
export default createPassword;