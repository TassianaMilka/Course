import {clubModel} from "../models/club-model";

export const findAllClubs = async () : Promise<PlayerModel> =>{

  const data=await  fs.reaFile("../data/clubs.json","utf-8");
  const clubs: ClubModel [] = JSON.parse(data);

  
  return clubs;
  
  
};