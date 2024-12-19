package data_structures.assignments

fun main() {

    val list1 = listOf("listen", "hello", "enlist", "rat")
    val list2 = listOf("silent", "world", "tinsel", "tar")

    println(solution(list1, list2).toString())
    println(solution2(list1, list2).toString())
}

private fun solution(list1: List<String>, list2: List<String>): Set<Pair<String, String?>> {
    val set1 = list1.map { word -> sortedWord(word) to word }.toSet()
    val set2 = list2.map { word -> sortedWord(word) to word }.toSet()

    val result = mutableSetOf<Pair<String, String?>>()

    for ((sorted1, originalW1) in set1) {
        for ((sorted2, originalW2) in set2) {
            if (sorted1 == sorted2) {
                result.add(Pair(originalW1, originalW2))
            }
        }
    }

    return result.toSet()
}

private fun solution2(list1: List<String>, list2: List<String>): Set<Pair<String, String?>> {
    val set1 = list1.associateBy { word -> sortedWord(word) }
    val set2 = list2.map { word -> sortedWord(word) to word }.toMap()

    println(set1.toString())
    println(set2.toString())

    val result = mutableSetOf<Pair<String, String?>>()

    for ((sorted1, originalW1) in set1) {
        for ((sorted2, originalW2) in set2) {
            if (sorted1 == sorted2) {
                result.add(Pair(originalW1, originalW2))
            }
        }
    }

    return result.toSet()
}

private fun sortedWord(word: String): String = word.toCharArray().sorted().joinToString("")

