
//Importação do módulo prompt  QrCode
import prompt from "prompt";
import promptSchemaQRCode from "../../prompts-schema/prompt-schema-qrcode.js";
import handle from "./handle.js";


//Função para criar o QR Code
async function createQRCode() {
  prompt.get(promptSchemaQRCode, handle);
  prompt.start();
}

//Exportação da função createQRCode
export default createQRCode;