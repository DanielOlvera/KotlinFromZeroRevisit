package exceptions_nullability

import jdk.jshell.spi.ExecutionControl
import java.io.File
import java.io.FileNotFoundException

fun main() {
    try {
        val value = readLine()!!.toDouble()
        println(value)
    } catch (e: Exception) {
        println("The value should be a number!")
    }

    // File reading
    val message = File("src/main/kotlin/exceptions_nullability/message.txt").readLines()[0]
    println(message)

    // File reading - if the file doesn't exist
    try {
        val messageE = File("src/main/kotlin/exceptions_nullability/message.txts").readLines()[0]
        println(messageE)
    } catch (e: FileNotFoundException) {
        println("Error: ${e.message}")
    }

    // File reading - Multiple exceptions and finally
    try {
        val repeat = readLine()!!.toInt()

        val messageE = File("src/main/kotlin/exceptions_nullability/message.txts ").readLines()[0]

        for (i in 0 until repeat) println(messageE)
    } catch (e: FileNotFoundException) {
        println("Error: ${e.message}")
    } catch (e: NumberFormatException) {
        println("Error: ${e.message}. Repeat value should be a number.") // This will display the exception in the local language
    } catch (e: Exception) {
        println("Error: ${e.localizedMessage}")
    } finally { // This will always get executed
        println("Into finally")
    }

    // Try as expression
    println("Enter something: ")
    println(isNumber(readLine()!!))


    // Custom exceptions
    println("Enter loan amount: ")
    println("Interest rate = ${loanInterestCalculator(readLine()!!.toDouble())}")

}

fun isNumber(value: Any): Boolean {
    //Try-catch as expression
    val result = try {
        value.toString().toDouble()
        true
    } catch (e:Exception) {
        false
    }

    return result
}

fun loanInterestCalculator(value: Double): Double {

    if (value > 100_000.0) {
        throw Exception("Loan can't be higher than 100,000")
    }
    return value * 0.10
}