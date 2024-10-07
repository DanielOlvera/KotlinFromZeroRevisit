package data_structures

fun main() {
    //When
    val value = readLine()?.toInt()

    when(value) {
        1 -> println("Value is 1")
        2 -> println("Value is 2")
        else -> println("Is neither 1 nor 2")
    }

    val fuel = "gasoline"

    when(fuel) {
        "gasoline", "diesel" -> println("The vehicle uses gasoline or diesel") // This means it is gasoline OR diesel
        else -> println("Uses other type of fuel")
    }

    println("Enter the age: ")
    val age = readLine()!!.toInt()

    when {
        age < 18 -> println("Is younger than 18")
        age < 60 -> println("Is older than 18")
        else -> println("Is a senior")
    }

    //When with ranks using 'in' that denotes a rank
    val age1 = readLine()!!.toInt()
    when(age1) {
        in 1..17 -> println("Teen")
        in 18..59 -> println("Adult")
        in 60..100 -> println("Senior")
        else -> println("Age is wrong!")
    }

    //When with ranks using 'in' that denotes a rank and using it as a result
    val age2 = readLine()!!.toInt()
    val messageResult = when(age2) {
        in 1..17 -> "Teen"
        in 18..59 -> "Adult"
        in 60..100 -> "Senior"
        else -> "Age is wrong!"
    }

    println(messageResult)

    // Check data type with when, 'is' checks if a value has certain type and performs an action
    val value1: Any = "Hola"

    when(value1){
        is String -> println("is string")
        is Int -> println("is int")
        is Long -> println("is long")
    }

    //We can call main() at the end of the main method to prevent the process to finish and
    //use the program continuously
}