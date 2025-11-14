/*Code about music with title,name and yearpublished.*/


fun main() {    
    val AvrilSong = Song("I'm With You", "Avril Lavigne",  2010,1000)
    AvrilSong.printDescription()
    println(AvrilSong.isPopular)
}


class Song(
    val title: String, 
    val music: String, 
    val yearPublished: Int, 
    val playCount: Int
 
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        
        println("$title, performed by $music, was released in $yearPublished.")
    }   
}
