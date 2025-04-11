# Recebe a entrada do usuário e armazena na variável "entrada"
entrada = input()

# Função responsável por receber um conceito e retornar sua respectiva descrição.
def descrever_conceito(conceito):
  if conceito == "ls":
    return "Lista o conteúdo do diretório atual"

# COMPLETE AQUI: Preencha corretamente cada conceito, considerando as descrições abaixo:
  elif conceito == "mkdir":
    return "Cria um novo diretório"

  elif conceito == "rm":
    return"Remove um arquivo ou diretório"

  elif conceito == "cd":
    return "Navega para outro diretório"

# Imprime a descrição do conceito recebido na "entrada" através da função "descrever_conceito". 
print(descrever_conceito(entrada))
