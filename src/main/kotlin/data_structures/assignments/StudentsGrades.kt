package data_structures.assignments

fun main() {
    val studentNames = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    val studentGrades = arrayOf(31.0, 94.0, 98.5, 75.0, 46.5, 75.0)

    val average = studentGrades.average()
    println("Average grade: $average")

    println("....................")

    val highestGrade = studentGrades.max()
    println("Highest grade: $highestGrade")

    val lowestGrade = studentGrades.min()
    println("Lowest grade: $lowestGrade")

    println("....................")

    for ((index, grade) in studentGrades.withIndex()) {
        if (grade < 60) {
            println("${studentNames[index]}, $grade")
        }
    }
}