
# Recebe a entrada do usuário e armazena na variável "entrada":
entrada = input()

# Função responsável por receber um conceito e retornar sua respectiva descrição:
def descrever_beneficio(beneficio):
  if beneficio == "Escalabilidade":
    return "Cresce ou reduz conforme necessidade"

# COMPLETE AQUI: Preencha corretamente cada conceito, considerando as descrições abaixo: 
  elif beneficio == "Alta Disponibilidade":
    return "Disponível quase sempre"
  elif beneficio == "Custo sob demanda":
    return "Paga apenas pelo que usar"
  elif beneficio == "Acesso global":
    return "Acesso de qualquer lugar"

print(descrever_beneficio(entrada))
