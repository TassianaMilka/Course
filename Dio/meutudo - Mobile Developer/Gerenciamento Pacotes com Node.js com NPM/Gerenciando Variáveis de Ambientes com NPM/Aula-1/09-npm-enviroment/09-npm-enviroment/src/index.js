
//Importar do banco de dado
import connectToDatabase from "./database/data.js";

//Função sobre a conexão do banco de dados
async function main() {
  await connectToDatabase(
    process.env.USERDATABASE,
    process.env.PASSWORDDATABASE
  );
}

main();