class safari{

    //data member
    var nambari:Int=9


      //member function
    fun square():Int{
        return nambari*nambari
    }
}

fun main(args: Array<String>) {
    //instance of my object

    val myobj=safari()
    println(myobj.square())
}