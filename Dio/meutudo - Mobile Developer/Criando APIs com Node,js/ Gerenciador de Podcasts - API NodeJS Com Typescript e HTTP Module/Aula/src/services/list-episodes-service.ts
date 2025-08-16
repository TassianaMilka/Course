//Importação de módulos

import { PodcastTransferModel } from "../models/Podcast-Transfer-Model";
import { repositoryPodcast } from "../repositories/podcasts-repository";
import { StatusCode } from "../utils/status-code";

//Exportação do serviço
export const serviceListEpisodes = async (): Promise<PodcastTransferModel> => {
  //define contrato
  let responseFormat: PodcastTransferModel = {
    statusCode: 0,
    body: [],
  };

  //busco os dados
  const data = await repositoryPodcast();

  //verifico o tipo de resposta
  responseFormat = {
    statusCode: data.length !== 0 ? StatusCode.OK : StatusCode.NoContent,
    body: data,
  };

  //Retorno da resposta
  return responseFormat;
};
