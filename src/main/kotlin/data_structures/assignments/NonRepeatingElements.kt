package data_structures.assignments

fun main() {
    //We must determine all elements in a given list that appear only once, meaning they don't have any duplicates in the same list.
//    val products = arrayListOf("ABC123", "DEF456", "GHI789", "ABC123", "JKL012", "MNO345", "DEF456", "PQR678", "ABC123", "XYZ901")

    val products = ArrayList<String>().apply {
        add("apple")
        add("banana")
        add("apple")
        add("orange")
        add("banana")
        add("banana")
        add("grape")
        add("apple")
        add("mango")
        add("banana")
        add("pineapple")
    }

    println(solution(products).toString())
}

private fun solution(products: List<String>): List<String> {
    val seen = mutableSetOf<String>()
    val recurrent = mutableSetOf<String>()

    for (product in products) {
        if (product in seen) {
            recurrent.add(product)
        } else {
            seen.add(product)
        }
    }

    val difference = seen - recurrent
    return difference.toList()
}