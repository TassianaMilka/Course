//Importação de modelo

import { PodcastModel } from "./podcast-model";

export interface PodcastTransferModel {
  statusCode: number;
  body: PodcastModel[];
}
