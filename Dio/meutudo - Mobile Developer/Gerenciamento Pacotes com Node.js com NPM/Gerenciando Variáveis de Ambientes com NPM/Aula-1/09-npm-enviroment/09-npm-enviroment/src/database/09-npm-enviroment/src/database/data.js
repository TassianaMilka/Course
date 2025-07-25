
//Importar o nome do usuário e senha do banco de dados
async function connectToDatabase(user, password) {
  if (
    user === process.env.USERDATABASE &&
    password === process.env.PASSWORDDATABASE
  ) {
    console.log("conexão com banco de dados estabelecida");
  } else {
    console.log(
      "Falha de login, não foi possível se conectar ao banco de dados"
    );
  }
}

//Exportar a função de conexão com o banco de dados
export default connectToDatabase;