#!/bin/bash


echo "Criando usuários do sistema...."

groupadd GRP_ADM
groupadd GPR_VEN
groupadd GRP_SEC

useradd lucas -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
-G  GRP_ADM

useradd guest11 -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
passwd guest11 -e

useradd guest12 -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
passwd guest12 -e

useradd guest13 -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
passwd guest13 -e

echo "Finalizado!!"

