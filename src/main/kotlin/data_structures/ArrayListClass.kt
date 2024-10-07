package data_structures

fun main() {

//    val empleado = arrayOf("Juan", "Carlos", "Wendy") // This is how we declare an array
    val employees = arrayListOf("Juan", "Carlos", "Wendy")

    employees.size
    //To add elementos
    employees.add("Peter")

    employees.size

    for (e in employees) println(e)
    println("........................")

    println(employees[0])

    // We can sort the elements with the sort method
    employees.sort()
    println("Sorted")
    println(employees.toString())

    //We can perform a remove operation
    employees.remove("Carlos")
    println("Removing Carlos: $employees")
    println("....................")

    //Foreach
    for (em in employees) { //Common way
        println(em)
    }
    println("....................")

    //Kotlin way to do a foreach using lambdas
    employees.forEach { emp ->
        println("For each: $emp")
    }

    println("....................")

    //For each indexed, this returns a pair object: the index and the value
    employees.forEachIndexed { i , empl ->
        println("$i - $empl")
    }
    println("....................")

}