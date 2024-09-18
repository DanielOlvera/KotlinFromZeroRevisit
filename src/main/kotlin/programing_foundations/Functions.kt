import java.util.*

fun main() {
    showMessage()
    println()
    showInfo(name = "Peter", age = 25)
    println()
    println(calculateTaxes(income = 10_000.00, taxPercentage = 16.0))
    println(functionWithParametersCalculateTaxes(income = 10_000.00))
}

//Function without parameters
fun showMessage() {
    println("""
        Message: Hi, from Kotlin!
        Date: ${Date()}
    """.trimIndent())
}

//Function with parameters
fun showInfo(name: String, age: Int) {
    println("""
        Name: $name
        Age: $age
    """.trimIndent())
}

//Function with return value
fun calculateTaxes(income: Double, taxPercentage: Double): Double {
    return (income / 100) * taxPercentage
}

//Function with parameters
fun functionWithParametersCalculateTaxes(income: Double, taxPercentage: Double = 16.0) {

}