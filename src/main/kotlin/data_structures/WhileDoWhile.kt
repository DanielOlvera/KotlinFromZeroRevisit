package data_structures

fun main() {

    println("Enter the names one by one, then press Enter to finish: \n")
    val employeeList = arrayListOf<String>()

    println("Enter the name: ")
    var employee = readLine()

    while (employee != "") {
        employeeList.add(employee.toString())
        println("Enter the name: ")
        employee = readLine()
    }

    println("------Result------")

    for (e in employeeList) println(e)

    // do-while loop, it will garantee that the code will execute at least once
    println("Enter the names one by one, then press Enter to finish: \n")
    val employeeList1 = arrayListOf<String>()

    do {
        println("Enter the name: ")
        val employee1 = readLine().toString()

        if (employee1 != "") employeeList1.add(employee1)
    } while (employee1 != "")

    println("------Result------")
    println("Total: ${employeeList1.size}")
    for (e in employeeList1) println(e)

    // We should avoid loops to execute indefinitely

}