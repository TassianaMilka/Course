//Importação do módulo qrcode-terminal e chalk
import qr from "qrcode-terminal";
import chalk from "chalk";

async function handle(err, result) {

  //Validação de erro 
  if (err) {
    console.log("error on application");
    return;
  }

  const isSmall = result.type == 2;

  qr.generate(result.link, { small: isSmall }, (qrcode) => {
    console.log(chalk.green("QR Code gerado com sucesso:\n"));
    console.log(qrcode);
  });
}

//Exportação da função handle
export default handle;