package exceptions_nullability

fun main() {
//    val value: Int? =  null
//    val result = value!! * value //We will use !! only if we are 100% sure that is never going to be null

    val value: Int =  10
    val result = value * value //In this example is guaranteed that the value is not null, so we don't get errors

    println(result)

    val input = readLine()

    if (input != null) {
        println("Is not null")
    } else {
        println("It is null")
    }

    //What if we want to use a null value
//    val side = if (input != null) input.toDouble() else 0.0
    try {
//        val side =  input?.toDouble() ?: 0.0 //Using elvis operator
        val side =  input?.toDoubleOrNull() ?: 0.0 //Using elvis operator, also with toDoubleOrNull we can avoid the
        //usage of try/catch

        val result2 = side * side

        println(result2)
    } catch (e: Exception) {
        println("Invalid input")
    }

    val input2 = readLine()
//    input2 = input2?.toUpperCase()
//    println(input2)

    val side = input2?.toDoubleOrNull()
    side?.let {
        val resultLet = it * it
        println("Let $resultLet")
    }

    println("Finished")
}