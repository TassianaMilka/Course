interface HttpResponse{
  status: number;
  body: any;
}


//Delegando

export const ok = async (data:any): Promise<HttpResponse> =>{

  return{
    statusCode:200,
    body: data,


  
  };
};

export const created= async(): Promise<HttpResponse> =>{

  return{

    statusCode:201,
    body:{
      
      message: "sucesseful",
        },

    };
};



export const noContent=  async ():Promise<HttpResponse> =>{

  return{

    statusCode:204,
    boby:null,
  }
};
