class talisman{
    var num1:Int=45
    var num2:Int=55

    fun add():Int{
        return num2+num1
    }

}

fun main(args: Array<String>) {
    val myobj=talisman()
    println(myobj.add())
}