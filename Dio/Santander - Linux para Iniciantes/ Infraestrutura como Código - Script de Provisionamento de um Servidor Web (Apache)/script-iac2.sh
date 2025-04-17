
#1/bin/bash

echo "Atualização o servidor ..."
apt-get update
apt-get upgrade -y
apt-get install apache2 -y
apt-get install unzip -y


echo"Baixando e copiando os arquivos da aplicação"

cd/ temp
wget link
wzip main.zip
cd linux-site-dio-main
cp -R* var/www/html/
