

/*1-Você consegue escrever uma função main() que gere essas mensagens em quatro linhas separadas?

Use the val keyword when the value doesn't change. 
Use the var keyword when the value can change.
When you define a function, you define the parameters that can be passed to it. 
When you call a function, you pass arguments for the parameters.*/



fun main() {
    
    println("Use the val keyword when the value doesn't change.");

    println("Use the var keyword when the value can change.");

    println("When you define a function, you define the parameters that can be passed to it.");

    println("When you call a function, you pass arguments for the parameters.");
    
    
}



/*2-Este programa gera para o usuário um aviso de que ele recebeu uma mensagem de bate-papo de um amigo.


fun main() { 
    println("New chat message from a friend'}
}
Você consegue descobrir e corrigir a causa raiz dos erros de compilação nesse programa?
O código usa os símbolos adequados para indicar o argumento de abertura e fechamento do argumento da string e da função?*/



fun main() { 
    println("New chat message from a friend");
}



/*3-Este programa informa os usuários sobre a próxima promoção de um determinado item. Ele tem um modelo de string, que depende da variável discountPercentage para o desconto percentual
e da variável item para o item à venda. No entanto, há erros de compilação no código.


fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
Você consegue descobrir e corrigir a causa dos erros?
Você consegue determinar a saída desse programa antes de executar o código no Playground Kotlin?*/



fun main() {
    val discountPercentage: Int = 20;
    val item = "Google Chromecast";

    println("Sale - Up to $discountPercentage% discount on $item! Hurry up!");
}






