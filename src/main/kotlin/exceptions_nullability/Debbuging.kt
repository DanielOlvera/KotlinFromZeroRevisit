package exceptions_nullability

fun main() {

    //Use of debugger with this file
    //This wil throw a number format exception
    //Try typing as string to trigger the exception
    //This will trigger java.lang.NumberFormatException
    val input = readLine()

    val result = input!!.toDouble() * input.toDouble()
    println(result)

    //This will trigger java.lang.ArrayIndexOutOfBoundsException
    val names = arrayOf("Peter", "Parker", "Spiderman")

//    for (i in 0..10) {
    for (i in 0 until names.size) { //Correct code, won't throw an exception
        println(names[i])
    }

    //This code contains logical errors
    //This code calculates the factorial of a number
    //This will reach an arithmetic overload for Int values
//    var number = readLine()!!.toIntOrNull()
    //So to change this we fix it for Long after number = 15
    var number = readLine()!!.toLongOrNull()
    number?.let {
        //zero by any number will return zero, so let's change that to get different values
//        var result2 = 0
        if (number < 0) {
            println("Factorial will work only with positive numbers")
        }
        var result2 = 1L
//        for(i in 0..number) { // Code with error for debugging
        for(i in 1..number) {
            result2 *= number
            number--

            if (result2 < 0) {
                println("The result is too big, can't be calculated")
                return@let
            }
        }
        println(result2)
    }
}