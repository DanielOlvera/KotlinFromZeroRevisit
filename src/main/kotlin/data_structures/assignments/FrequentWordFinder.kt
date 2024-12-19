package data_structures.assignments

fun main() {
    val text = """
        Were you in love with her The question is in a way meaningless she knows but one must ask 
        Love in such situations is rarely real Sex is the engine exalting and ruining people sex and frustration 
        Love is what people believe is worth the path of devastation

    """.trimIndent()

    println(solution(text))
}

private fun solution(text: String): String {
    var result = ""
    val wordMap = mutableMapOf<String, Int>()
    val wordList = text.lowercase().split(" ")

    for (word in wordList) {
        if (wordMap.containsKey(word)) {
            wordMap[word] = wordMap.getValue(word) + 1
        } else {
            wordMap[word] = 1
        }
    }

    val entries = wordMap.entries.toList()

    val sortedEntries = entries.sortedByDescending { it.value }

//    println(sortedEntries)
//
//    val topThree = sortedEntries.take(3)
//
//    val topThreeKeys = topThree.map { it.key }

    result = """
        Most repeated words:
        
        1. ${sortedEntries[0]}
        2. ${sortedEntries[1]}
        3. ${sortedEntries[2]}
    """.trimIndent()

    return result
}