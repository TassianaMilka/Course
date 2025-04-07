#5-Como desafio, você recebeu a tarefa de desenvolver um código que contabiliza as pontuações de estudantes de uma instituição de ensino de acordo com suas respostas
#num teste. Este código deve ser testado para um exemplo de 3 estudantes com uma lista de listas em que cada lista possui as respostas de 5 questões objetivas de cada estudante. Cada questão vale um ponto e as alternativas possíveis são A, B, C ou D.
#Caso alguma alternativa em um dos testes não esteja entre as alternativas possíveis, você deve lançar um ValueError com a mensagem "A alternativa [alternativa] não é uma opção de alternativa válida". O cálculo das 3 notas só será realizado mediante as 
#entradas com as alternativas A, B, C ou D em todos os testes. Se não for lançada a exceção, será exibida uma lista com as notas em cada teste.


def calcular_pontuacao(respostas_estudantes, gabarito):
    pontuacoes = []
    try:
        for respostas in respostas_estudantes:
            pontuacao = sum(1 for i in range(len(gabarito)) if respostas[i] == gabarito[i])
            pontuacoes.append(pontuacao)
        return pontuacoes
    except IndexError as e:
        print(f"Erro: As listas de respostas estão com tamanhos inconsistentes. {e}")
    except Exception as e:
        print(f"Erro inesperado: {e}")
    finally:
        print("Fim da execução da função")


gabarito_correto = ["A", "B", "C", "D", "A"]


respostas_estudantes = [
    ["A", "B", "C", "D", "A"], 
    ["A", "C", "C", "D", "B"],  
    ["B", "B", "C", "A", "D"]   

]

pontuacoes = calcular_pontuacao(respostas_estudantes, gabarito_correto)
print(f"Pontuações dos estudantes: {pontuacoes}")


######


#6-Você está trabalhando com processamento de linguagem natural (NLP) e, dessa vez, sua líder requisitou que você criasse um trecho de código que recebe uma lista com as palavras separadas de uma frase gerada pelo ChatGPT.



def processar_frase(lista_palavras):
    try:
    
        frase_reconstruida = " ".join(lista_palavras)
        
       
        frequencia_palavras = {palavra: lista_palavras.count(palavra) for palavra in set(lista_palavras)}

        return frase_reconstruida, frequencia_palavras
    except TypeError as e:
        print(f"Erro de tipo: {e}")
    finally:
        print("Fim da execução da função")


lista_exemplo = ["ChatGPT", "é", "um", "modelo", "de", "IA", "modelo", "baseado", "em", "transformers"]
frase, frequencia = processar_frase(lista_exemplo)

print(f"Frase reconstruída: {frase}")
print(f"Frequência das palavras: {frequencia}")



#7-Você foi contratado(a) como uma pessoa cientista de dados para auxiliar um laboratório que faz experimentos sobre o comportamento de uma cultura de fungos. O laboratório precisa avaliar constantemente a razão (divisão) entre os 
#dados de pressão e temperatura do ambiente controlado recolhidos durante a experimentação para definir a melhor condição para os testes.





######
