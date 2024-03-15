fun main(args: Array<String>) {
  //  mutable variables/changeable

    var myname="Albert"
    myname="Matiru"
    println("My name is " + myname)
    println("My name is $myname")

    //immutable variable
    //school="emobilis"
val school="eMobilis"
    println("I learn coding at $school")

    var num1=80
    var num2=2
    println("The sum of $num1 and $num2 is ${num2+num1}")
    println("The product of $num1 and $num2 is ${num2*num1}")
    println("The difference of $num1 and $num2 is ${num1-num2}")
    println("The quotient of $num1 and $num2 is ${num1/num2}")
}

