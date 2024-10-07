package data_structures

fun main() {
    val employe = arrayOf("Jesus", "Alberto", "Claudia", 5) //We can have arrays with different data types
    val employe1 = intArrayOf() //This will allow only int type
    val employe2 = booleanArrayOf() //This will allow only boolean type
    //There's no arrays specific to strings

    println(employe[2])
    println("Size: ${employe.size}") //To get the elements size

    //We can reassign the values inside the array
    employe[3] = 100
    println("Item 3 = ${employe[3]}")

    //For this val array we cannot create a new instance, however if we use var we can create a new instance of the
    //array

    // For loop
    for (x in 0..5) {
        println(x)
    }

    //We can use it with Arrays
    val values = intArrayOf(10, 15, 20, 25, 30)

    //This is called a for over indices
    for (x in 0 until values.size) { // Until we go until a value smaller than the array
        println(values[x])
    }

    //This is the same as
    //This is called a for over elements
    for (element in values) {
        println(element)
    }

    var sum = 0
    for (i in values) {
        sum += i
    }

    println("Sum = $sum")

    for (e in 0 until employe.size) println(employe[e]) // As the for only contains one instruction

    println("/---/")

    // Use of break, will stop to loop to continue iterating given a condition
    for (e in employe) {
        println(e)
        if (e == "Alberto") {
            break
        }
    }

    println("Finished")

    //Use of withIndex()
    var cntr = 0
    for (em in employe) {
    println("$em $cntr")
        cntr++
    }

    //This is the same as
    for ((counter, em) in employe.withIndex()) {
        println("$em $counter")
    }

    //Use of step
    //This will iterate from 0 to 10 with a step of 2, like: 0 2 4 6 8 10
    for (x in 0..10 step 2) {
        println(x)
    }
}