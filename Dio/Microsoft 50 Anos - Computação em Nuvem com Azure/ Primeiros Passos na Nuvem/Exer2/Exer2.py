
# Recebe a entrada do usuário e armazena na variável "entrada":
entrada = input()

# Função responsável por receber um conceito e retornar sua respectiva descrição:
def identificar_recurso(tarefa):
  if tarefa == "Criar um servidor com sistema operacional":
    return "Máquina Virtual"

# COMPLETE AQUI: Preencha corretamente cada conceito, considerando as descrições abaixo: 
  elif tarefa == "Guardar dados em um banco relacional":
    return "Instância de Banco de Dados"
  elif tarefa == "Explorar os serviços disponíveis":
    return "Portal Azure"
  elif tarefa == "Criar conta para acessar o Azure":
    return "Conta Microsoft e Assinatura"

print(identificar_recurso(entrada))

