//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

function copilot_no_bing(funcionalidade) {
    if (funcionalidade === "Resumo de pesquisas") {
        return "Processa consultas e resumos utilizando resultados da web.";
    } else if (funcionalidade === "Interações por chat") {
        return "Permite conversar via texto, imagem ou entrada de voz.";
    } else if (funcionalidade === "Geração de conteúdo criativo") {
        return " Facilita a criação de poemas, piadas, histórias e imagens digitais.";
    } else {
        return "Recurso não reconhecido.";
    }
}

// Entrada do usuário usando "gets" na DIO
let entrada = gets().trim();

// Chamada da função com a entrada do usuário
let resultado = copilot_no_bing(entrada);

// Exibindo o resultado usando "print" na DIO
print(resultado);








//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

function githubCopilot(funcionalidade) {
    if (funcionalidade === "GitHub Copilot Chat") {
        return "Interface de chat para devs integrada com VS Code e Visual Studio.";
    } else if (funcionalidade === "GitHub Copilot para solicitações de pull") {
        return "Adiciona tags automáticas de IA em PRs para revisões.";
    } else if (funcionalidade === "GitHub Copilot for Docs") {
        return "Respostas geradas por IA sobre documentação.";
    } else if (funcionalidade === "Copilot para a CLI") {
        return "Compõe comandos e gera sinalizadores para devs, ajudando na sintaxe.";
    }else{
      
          return "Recurso não reconhecido.";
    }
}

// Entrada do usuário
let entrada = gets().trim();

// Chamada da função com a entrada do usuário
let resultado = githubCopilot(entrada);

// Exibindo o resultado, se houver
print(resultado);





//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.


function microsoftCopilot(funcionalidade) {
    if (funcionalidade === "Gerar conversas") {
        return " Aperfeiçoa respostas do Copiloto com links internos.";
    } else if (funcionalidade === "Transforme conversa em ação") {
        return "Integra Power Platform, Power Automate e prompts de IA.";
    } else if (funcionalidade === "Da vida aos seus sistemas") {
        return "Seleciona conectores de dados para eficiência operacional.";
    } else if (funcionalidade === "Trazer seus próprios modelos do Azure") {
        return "Configura, treina e conecta serviços no Azure, como o Azure OpenAI.";
    }
}

// Entrada do usuário
let entrada = gets().trim();

// Chamada da função com a entrada do usuário
let resultado = microsoftCopilot(entrada);

// Exibindo o resultado, se houver
print(resultado);
