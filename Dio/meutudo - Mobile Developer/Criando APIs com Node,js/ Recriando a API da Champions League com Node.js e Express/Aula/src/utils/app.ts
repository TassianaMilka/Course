//Importação
import express ,{ Request , Respose} from "express";
import {getPlayer} from "./controllers/players-controller";


function createApp(){

  const app= express()


  app.use(express.json());


  app.get ("\n",getPlayer);

   const corsOptions={
    origin: ["#"],
    metods: ["GET","UPDATE"],
   };
   
  //Retorno app
  return app;


}

//Exportação
 export default createApp;
