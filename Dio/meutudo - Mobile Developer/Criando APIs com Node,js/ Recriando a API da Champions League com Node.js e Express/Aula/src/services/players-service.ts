//Importação
import * as PlayerRepostory from "../repositories/player-repository";
import {noContent , ok} from "../utils/http-helper";
import * as HttpResponse from "../utils/http-helper";
import * as {StaticsModel} from "../models/statistics-mode";

export const  getPlayerData = async() =>{
//  return{player:"nome"};

const data={player:"nome"};
let response = null;


if(data){

  response = await ok(data);

} else{

  response = await noContent();

}

  //Retorno
  return response;


};

export const delePlayerService = async (id: number)=>{

  let response = null;
   
  const isDeleted= await PlayerRepostory.deleteOnePlayer(id);

   if(isDeleted){

    response = await HttpResponse.ok({message:"deleted"});

   }else{

    response = await HttpResponse.badRequest();
    
   }
};

export const updatePlayerService = async(id:number,statistics: StaticsModel){

let response = null;


if(Object.keys(data). length === 0){

  response = await HttpResponse.badRequest();

}else{

  response = await HttpResponse.ok(data);
}
  
    return response;

}





