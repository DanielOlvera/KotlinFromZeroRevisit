package data_structures.assignments

fun main() {

    val employeeDB = listOf<MutableMap<String, Any>>(
        mutableMapOf(
            "name" to "Peter",
            "role" to "developer",
            "salary" to 85500
        ),
        mutableMapOf(
            "name" to "Laura",
            "role" to "manager",
            "salary" to 80500
        ),
        mutableMapOf(
            "name" to "Sam",
            "role" to "developer",
            "salary" to 55500
        ),
        mutableMapOf(
            "name" to "Peter",
            "role" to "sales",
            "salary" to 15500
        ),
        mutableMapOf(
            "name" to "Peter",
            "role" to "intern",
            "salary" to 75500
        )
    )

    val result = solution(employeeDB)
    println(result)
}

private fun solution(employeeDB: List<MutableMap<String, Any>>): List<MutableMap<String, Any>> {

    for (employee in employeeDB ) {
        if (employee["role"] == "developer") {
            val bonus = employee["salary"].toString().toInt() * 0.1
            val extraTotal = employee["salary"].toString().toInt() + bonus
            employee["bonus"] = bonus
            employee["salary"] = extraTotal
        }
    }

    return employeeDB
}