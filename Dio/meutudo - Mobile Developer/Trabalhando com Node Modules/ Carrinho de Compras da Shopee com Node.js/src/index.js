//Importar dos dados do arquivo do banco de dados e da api


import { disconnectDatabase ,databaseType} from "./utils/database.js";
import * as api from "./utils/api.js";

api.getDataFromApi();
disconnectDatabase();

