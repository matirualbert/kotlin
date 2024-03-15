open class parent{

    var dad="He likes reading books."
    var mum="She likes cooking food."

}
class girl:parent(){
    fun cooking(){
        println(mum)
    }


}
class boy:parent(){
    fun books(){
        println(dad)
    }

}

fun main(args: Array<String>) {
    val obj1=girl()
    obj1.cooking()

    val obj2=boy()
    obj2.books()
}