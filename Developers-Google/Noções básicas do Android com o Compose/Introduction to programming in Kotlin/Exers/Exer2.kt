/*1-Print number*/


fun main() {
    val count: Int = 3
    println(count)
}
 


/*2-Print message about number one*/

fun main() {
    val count: Int = 1
    println("You have $count unread messages.")
}


/*3-Message numbers 60+5 resukt*/

fun main() {
    val unreadCount = 60
    val readCount = 6
    println("You have ${unreadCount + readCount} total messages in your inbox.")
}


#Or

fun main() {
    val unreadCount = 60;
    val readCount = 6;
    println("You have ${unreadCount + readCount} total messages in your inbox.");
}


/*4-Print two type String about numbers*/

fun main() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}



/*5-Cout the ++ and -- two messages print*/




fun main() {
    var count = 10
    println("You have $count unread messages.")
    count = count + 1
    println("You have $count unread messages.")
}



fun main() {
    var count = 10
    println("You have $count unread messages.")
    count++
    println("You have $count unread messages.")
}


fun main() {
    var count = 10
    println("You have $count unread messages.")
    count--
    println("You have $count unread messages.")
}


/*6-String menssages and sum two numbers*/

fun main() {
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    val sum=3+2
    println(sum)
    println(reminder)
}


