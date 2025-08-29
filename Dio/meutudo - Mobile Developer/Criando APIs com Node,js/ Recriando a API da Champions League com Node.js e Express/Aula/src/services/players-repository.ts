//Interface dos dados
interface PlayerModel{

  id:number;
  name:string;
}


const database : PlayerModel[] =[

  {id : 1 , name :"nome"},
  {id : 2 , name :"nomes"},

];

//Exportação de retorno do banco de dado
export const findAllPlayers = async (): Promise<PlayerModel[]> => {
  return database;
};

//Exportação de retorno
export const findPlayerById = asyns(id: number) : Promise<PlayerModel> =>{

  return database.find((player)) => getPlayer.id ==id);

};

export const findPlayerById =async(

  id: number
) : Promise<PlayerModel | undefined> =>{

  return database.find(player) => getPlayer.id ==id);
  
};

export cont insertPlayer = asyns(player:PlayerModel)=>{

  if(Object.keys(player).length ===0){

    console.log(player);

  }else {

    console.log("bad request");

    return HttpResponse.badRequest();
  }
};


export const deleteOnePlayer = async (id: number)=>{

  const index = database.findIndex(p=> p;id===id);

  if(index==-1){

   database.splice(index,1);
   await PlayerRepostory.deleteOnePlayer(id);

   response= HttpResponse.ok({message:"deleted"});
   return Response;
   
  }
};

export const updatePlayerService =async(

  id:number,
  statistics: StaticsModel
) =>{




};