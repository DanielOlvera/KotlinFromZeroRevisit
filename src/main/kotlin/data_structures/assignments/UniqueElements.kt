package data_structures.assignments

fun main() {
    //given two lists, list1 and list2, we need to find elements that exist only in list1 and elements that exist only in list2, respectively.
    val list1 = listOf("apple", "banana", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "jackfruit", "kiwi")
    val list2 = listOf("apple", "mango", "pineapple", "quince", "raspberry", "strawberry", "tangerine", "ugli fruit", "victoria plum", "watermelon")

    println(solution(list1, list2))
}

fun solution(lis1: List<String>, list2: List<String>): Pair<List<String>, List<String>> {
    val set1 = lis1.toSet()
    val set2 = list2.toSet()

    val unique1 = set1 - set2
    val unique2 = set2 - set1

    return Pair(unique1.toList().sorted(), unique2.toList().sorted())
}