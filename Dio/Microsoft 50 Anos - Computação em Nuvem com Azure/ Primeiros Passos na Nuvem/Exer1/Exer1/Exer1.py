# Recebe a entrada do usuário e armazena na variável "entrada":
entrada = input()

# Função responsável por receber um conceito e retornar sua respectiva descrição:
def descrever_servico(servico):
  if servico == "IaaS":
    return "Infraestrutura como serviço"

# COMPLETE AQUI: Preencha corretamente cada conceito, considerando as descrições abaixo: 
  elif servico == "PaaS":
    return "Plataforma como serviço"
  elif servico == "SaaS":
    return "Software como serviço"
  elif servico == "FaaS":
    return "Função como serviço, baseada em eventos"

print(descrever_servico(entrada))
