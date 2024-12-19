package data_structures.assignments

fun main(args: Array<String>) {
    println("Array Intersection")

    val list1 = arrayOf("Peter", "Sam", "Helena", "Patrick", "John", "Jane")
    val list2 = arrayOf("Peter", "Allison", "Sophia", "Patrick", "Aditya", "Kim")

    println(solution(list1, list2).toString())
}

private fun solution(list1: Array<String>, list2: Array<String>): List<String> {
    val set1 = list1.toSet()
    val set2 = list2.toSet()

    val intersection = set1.intersect(set2)

    return intersection.toList().sorted()
}