

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



/*7-O Gmail tem um recurso que envia uma notificação ao usuário sempre que uma tentativa de login é feita em um novo dispositivo.

Neste exercício, você vai criar um programa que mostra uma mensagem aos usuários com este modelo:


There's a new sign-in request on operatingSystem for your Google Account emailId.
É necessário implementar uma função que aceite parâmetros operatingSystem e emailId, construa e retorne a mensagem no formato fornecido.

Por exemplo, se a função foi chamada com "Chrome OS" para o operatingSystem e "sample@gmail.com" para o emailId, ela vai retornar esta string:


There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com.
Etapa 1
É possível implementar a função displayAlertMessage() nesse programa para que ele mostre o resultado abaixo?

fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.*/



fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}


fun displayAlertMessage(operatingSystem : String, emailId: String): String {
    
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."

}

/*Etapa 2
Muito bem! Você mostrou a mensagem. No entanto, em alguns casos, você vai perceber que não é possível determinar o sistema operacional do usuário. Nessas situações, é preciso especificar o nome do sistema operacional como Unknown OS. É possível otimizar ainda mais o código para que não seja necessário transmitir o argumento Unknown OS sempre que a função for chamada.

Você consegue encontrar uma maneira de otimizar o código com essas informações para que ele gere a saída abaixo?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
Para mostrar a mensagem acima, substitua a implementação da função main() por esta:

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}*/


/*Etapa 2
Muito bem! Você mostrou a mensagem. No entanto, em alguns casos, você vai perceber que não é possível determinar o sistema operacional do usuário. Nessas situações, é preciso especificar o nome do sistema operacional como Unknown OS. É possível otimizar ainda mais o código para que não seja necessário transmitir o argumento Unknown OS sempre que a função for chamada.

Você consegue encontrar uma maneira de otimizar o código com essas informações para que ele gere a saída abaixo?

There's a new sign-in request on Unknown OS for your Google Account user_one@gmail.com.

There's a new sign-in request on Windows for your Google Account user_two@gmail.com. 

There's a new sign-in request on Mac OS for your Google Account user_three@gmail.com. 
Para mostrar a mensagem acima, substitua a implementação da função main() por esta:

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId. 
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}*/

fun main() {
    
    val firstUserEmailId = "user_one@gmail.com"
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(firstUserEmailId,secondUserOperatingSystem,secondUserEmailId,thirdUserOperatingSystem,
                                thirdUserEmailId))
 
}



fun displayAlertMessage(firstUserEmailId:String,secondUserOperatingSystem: String, secondUserEmailId :String,   
                       thirdUserOperatingSystem : String,thirdUserEmailId: String): 
String {
    
    return "$firstUserEmailId,$secondUserOperatingSystem,$secondUserEmailId ,$thirdUserOperatingSystem and $thirdUserEmailId."

}


/*8-O pedômetro é um dispositivo eletrônico que conta o número de passos. Atualmente, quase todos os smartphones, smartwatches e equipamentos de ginástica vêm com pedômetros integrados. O app de saúde e fitness usa pedômetros
integrados para calcular esse número. Essa função calcula o número de calorias que o usuário queima com base nos passos dados.*/



fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
    
}

fun main() {
    
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
    
}


/*9-Os smartphones modernos têm um recurso integrado que monitora o tempo de uso, ou seja, o tempo que você passa no smartphone por dia.

Neste exercício, você vai implementar uma função que compara o tempo em minutos gasto no smartphone no dia atual com o tempo gasto no dia anterior. A função aceita dois parâmetros inteiros e retorna um valor booleano.

O primeiro parâmetro contém o número de minutos que você gastou no dia atual e o segundo contém o número de minutos gastos no dia anterior. A função vai retornar um valor true se você tiver passado mais tempo no smartphone no dia atual em comparação com o dia anterior. Caso contrário, ela retorna um valor false.

Por exemplo, se você chamou a função com os argumentos nomeados abaixo:

timeSpentToday = 300 e timeSpentYesterday = 250, a função retorna um valor true.
timeSpentToday = 300 e timeSpentYesterday = 300, a função retorna um valor false.
timeSpentToday = 200 e timeSpentYesterday = 220, a função retorna um valor false.
Dica: o operador de comparação > retorna true se o valor antes do operador for maior que o valor após o operador. Caso contrário, ela retorna um valor false.*/



fun main() {
    
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
    
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    
    return timeSpentToday > timeSpentYesterday
    
}



/*10-Este programa mostra a previsão do tempo para diferentes cidades. Ele inclui o nome da cidade, as temperaturas máximas e mínimas do dia e a chance de chuva.


fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}
Existem muitas semelhanças com o código que mostra o clima de cada cidade. Por exemplo, há frases que são repetidas várias vezes, como "City:" (cidade) e "Low temperature:" (temperatura baixa). Códigos semelhantes e repetidos apresentam risco de erros no programa. Em uma das cidades, você pode ter um erro de digitação ou esquecer um dos detalhes meteorológicos.

É possível criar uma função que mostra os detalhes do clima para uma cidade a fim de reduzir a repetição na função main() e fazer o mesmo com as cidades restantes?
É possível atualizar a função main(), chamar a função que você criou para cada cidade e transmitir os detalhes adequados do clima como argumentos?*/






fun main() {
    
    printWeatherForCity("Ankara", 27, 31, 82)
    printWeatherForCity("Tokyo", 32, 36, 10)
    printWeatherForCity("Cape Town", 59, 64, 2)
    printWeatherForCity("Guatemala City", 50, 55, 7)
    
}

fun printWeatherForCity(cityName: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    
    println("City: $cityName")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")

}
