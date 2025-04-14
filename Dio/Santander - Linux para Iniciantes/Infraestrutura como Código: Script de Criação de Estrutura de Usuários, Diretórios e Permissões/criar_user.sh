#!/bin/bash


echo "Criando usuários do sistema...."

groupadd GRP_ADM
groupadd GPR_VEN
groupadd GRP_SEC

useradd lucas -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
-G  GRP_ADM

useradd marta -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
passwd  GPR_VEN  -e

useradd flavio -c "Usuário convidado" -s /bin/bash -m -p $(openssl passwd -crypt Senha123)
passwd  GRP_SEC -e


echo "Finalizado!!"

