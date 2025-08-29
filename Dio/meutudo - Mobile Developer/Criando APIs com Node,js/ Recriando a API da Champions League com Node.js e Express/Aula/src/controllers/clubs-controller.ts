import {Request, Responde} from "express";


export const getClubs = (req:Request,res:Response) =>{

 const data=[

  {
    
    id:1,
    name:"Clube",

  },
 ];


 const response = HttpResponse.ok(data);

   return response;
};

