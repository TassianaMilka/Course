//Dados do banco de dados

const databaseType={

  userType:"admin",
  typeData:"datalocal",

};

//Função para conectar o banco de dados

async function connecToDatabase(dataName){


  console.log('conetado ao banco ${dataName}');


}

//Função para desconectar o banco de dados

async function  disconnectDatabase(dataName){


  console.log('desconectado do banco');

}

//Exportar as funções do banco de dados

export { connectToDatabase, disconnectDatabase, databaseType };

// module.exports = {
//   connectToDatabase,
//   disconnectDatabase
// }

  
