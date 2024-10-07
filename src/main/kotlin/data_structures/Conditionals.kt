package data_structures

var sessionStarted = false
fun main() {

    // If else
    if (sessionStarted || sessionStarted != false) { //Both conditions are the same
        println("Welcome!")
    } else {
        println("Please start session")
    }

    // If else-if else
    print("Enter your age: ")
    val age0 =  readLine()!!.toInt()

    if (age0  < 18) {
        println("Is a teen")
    }else if (age0 < 60) {
        println("Is a senior")
    } else {
        println("Is older than 18")
    }

    // Logical Operators
    val age1 = 20
    val aval = true

    if (age1 > 20 && aval) { // If both conditions are true
        println("Grant loan")
    }

    if (age1 > 20 || aval) { // If one of the 2 conditions is true
        println("Grant loan")
    }

    if (!aval) { // If always evaluates the condition is true, ! opretor changes the logical value of the boolean value
        println("Has aval")
    }

    val age2 = 17
    var result = ""

    if (age2 > 18) {
        result = "Is an adult"
    } else {
        result = "Is a teen"
    }

    println(result)

    val age = 16
    val messageResult = if (age >= 18) "Is older than 18" else "Is younger"
    println(messageResult)
}