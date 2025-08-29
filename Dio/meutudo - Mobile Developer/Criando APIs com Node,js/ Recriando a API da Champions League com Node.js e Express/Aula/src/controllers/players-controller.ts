//Importação
import { Request ,Response} from "express";
import { getPlayerData} from "../services/players-service";
import {ok} from "../utils/http-helper";

export const getPlayer=async (req:Request , res: Response) => {
  const data = await getPlayerService();
  const Response = await ok(data);
  res.status(Response.statusCode).json(Response.body);

};

export const getPlayerById = async (req: Request, res: Response) => {

  const data = await PlayerRepository.findPlayerById(id);
  const Respores= null;

    if(data){

      responde = 0k(data);
    }else {

      response = noContent();
    }

   //Retorno do resultado
    return Response;

};


export const postPlayer = async (req: Request, res: Response) =>{

  const bobdyValue = req.body;
  const HttpResponse = await Service.createPlayerService(bodyValue);

  if(HttpResponse){

    res.status(HttpResponse.statusCode).json(HttpResponse.body);

  }
};



export const deletePlayer = asyns (req:Request , res:Reponse) =>{

  const id = parseInt(req.params.id)
  const HttpResponse = await ServiceWorker.deletePlayerService(id)
  
  res.status(HttpResponse.statusCode).json(HttpResponse.body);


};


export const updatePlayerService = async (req:Request,res:Response) =>{

  const id = parseInt(req.params.id);
  const bodyValue = req.body;
  const HttpResponse = await Service.updatePlayerService(id,bodyValue);

  res.status(HttpResponse.statusCode).json(HttpResponse.body);



};

