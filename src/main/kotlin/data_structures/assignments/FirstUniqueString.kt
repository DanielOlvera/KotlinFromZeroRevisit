package data_structures.assignments

fun main() {
    val inputList = listOf("apple", "banana", "apple")

    println(solution(inputList))
}

private fun solution(inputList: List<String>): String {
    val seen = mutableSetOf<String>()
    val duplicate = mutableSetOf<String>()

    for (s in inputList) {
        if (s in seen) {
            duplicate.add(s)
        } else {
            seen.add(s)
        }
    }

    for (w in inputList) {
        if (w !in duplicate){
            return w
        }
    }

    return ""
}