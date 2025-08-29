//Importação
import express ,{Request, Response} from "express";


const app =express();
const port = process.env.PORT;


//Método

/*app.get("/",getPlayer) =>(
  res.status(200).json({player:"backham"}); */



//app.listen(3000);

app.listen(port,() =>{

  console.log(`Server is running on port ${port}`);

});


