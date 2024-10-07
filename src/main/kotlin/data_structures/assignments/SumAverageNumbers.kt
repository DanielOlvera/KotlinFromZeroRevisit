package data_structures.assignments

fun main() {

    var sum = 0.0
    val average: Double
    var counter = 0.0
    var inputNumber: Double

    println("Enter a number and stop by entering 0: ")
    inputNumber = readLine()!!.toDouble()

    while (inputNumber != 0.0) {

        sum += inputNumber
        counter++

        println("Enter a number and stop by entering 0: ")
        inputNumber = readLine()!!.toDouble()
    }


    println("Sum = $sum")

    average = sum / counter
    println("Average = $average")
}

//This is the author solution
//https://gitlab.com/jeo-dev/kotlin/curso-basico-programacion-kotlin-ejercicios-resueltos/blob/master/S4/Soluci%C3%B3n%20S4-E3.kt