

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



/*4-Este programa mostra o número total de pessoas em uma festa. Ele inclui adultos e crianças. A variável numberOfAdults contém o número de adultos na festa, e a variável numberOfKids contém o número de crianças.


fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}
Etapa 1
Você consegue determinar a saída desse programa antes de executar o código no Playground Kotlin?
Depois de determinar a saída, execute o código no Playground Kotlin e verifique se ela corresponde à que foi mostrada.

Dica: o que acontece quando você usa o operador + em duas strings?

Etapa 2
O código funciona e mostra alguns resultados, mas não o número total de pessoas participando.

Você consegue encontrar e corrigir o problema no código para que ele gere este resultado?

The total party size is: 50*/



fun main() {
    val numberOfAdults = 20;
    val numberOfKids = 30;
    val total = numberOfAdults + numberOfKids;
    
    println("The total party size is: $total");
}




/*5-Este programa mostra o salário total que um funcionário recebe no mês. O salário total é dividido em duas partes: a variável baseSalary, que o funcionário recebe todos os meses, e a variável bonusAmount, que é um bônus adicional concedido ao funcionário.


fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}
Você consegue descobrir a saída desse código antes de o executar no Playground Kotlin?
Quando você executa o código no Playground Kotlin, ele gera a saída esperada?*/




fun main() {
    
    val baseSalary = 5000;
    val bonusAmount = 1000;
    val totalSalary = baseSalary + bonusAmount;

    
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).");
    
}

/*6-Neste exercício, você vai criar um programa que executa operações matemáticas básicas e mostra a resposta.

Etapa 1
A função main() contém um erro de compilação:


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    
    println("$firstNumber + $secondNumber = $result")
}
Você pode corrigir o erro para que o programa mostre este resultado?

10 + 5 = 15*/



fun main() {
    val firstNumber = 10;
    val secondNumber = 5;
    
    println(firstNumber + secondNumber);
}


/*7-Etapa 2
O código funciona, mas a lógica para adicionar dois números está localizada na variável resultante, tornando o código menos flexível à reutilização. Em vez disso, é possível extrair a operação de adição para uma função add() para que o código seja reutilizável. Para fazer isso, atualize o código para que fique como o mostrado abaixo. O código agora introduz uma nova variável val chamada thirdNumber e mostra o resultado dessa nova variável com firstNumber.


fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
Você pode definir a função add() para que o programa gere essa saída?

10 + 5 = 15
10 + 8 = 18*/


fun main() {
    
    val firstNumber = 10;
    val secondNumber = 5;
    val thirdNumber=8;
    val resultOne = firstNumber + secondNumber;
    val resultTwo = firstNumber + thirdNumber;

    println(resultOne);
    println(resultTwo);
}

fun add(firstNumber: Int, secondNumber: Int,thirdNumber:Int): Int {
    
    return firstNumber + secondNumber;
    return firstNumber + thirdNumber;
    
    
}


/*Etapa 3
Agora você tem uma função reutilizável para adicionar dois números.

É possível implementar a função subtract() da mesma forma que a função add()? Modifique a função main() também para usar a função subtract() para verificar se ela funciona como esperado.
Dica: pense na diferença entre adição, subtração e outras operações matemáticas. Comece a trabalhar no código da solução a partir disso.*/




fun main() {
    
    val firstNumber = 10;
    val secondNumber = 5;
    val thirdNumber=8;
    val resultOne = firstNumber - secondNumber;
    val resultTwo = firstNumber - thirdNumber;

    println(resultOne);
    println(resultTwo);
}

fun add(firstNumber: Int, secondNumber: Int,thirdNumber:Int): Int {
    
    return firstNumber - secondNumber;
    return firstNumber - thirdNumber;
    
    
}


