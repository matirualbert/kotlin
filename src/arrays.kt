fun main(args: Array<String>) {
    var myarr= arrayOf("Albert", "Scarlet",true, 78, 67, 98f, 'e')
    myarr[0]="Matiru"
    println("My name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,67,1,)

    println(myintarr.sorted())

    //var myfltarr= arrayOf<Float>(97.3f, 65.89f,978.74f,)
   // println("My name is ${myfltarr[3]} and my float is ${myfltarr[0]}")
}