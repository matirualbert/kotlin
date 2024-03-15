class pericles(val jina: String, val miaka: Int, val jinsia: String, )

fun main(args: Array<String>) {
    val myobj= pericles("Socrates",18,"male")
    println("My name is ${myobj.jina}")
    val myobj2= pericles("Carl Jung",18,"Male")
    println("My name is ${myobj2.jina}, I'm ${myobj.miaka} years old and my gender is ${myobj2.jinsia}")
}