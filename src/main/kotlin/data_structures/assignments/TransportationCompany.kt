package data_structures.assignments

import kotlin.math.roundToInt

fun main() {
    val general_fare = 2.25

    do {
        var tripCost: Double

        println("Enter trip distance: ")
        val tripDistance = readLine()!!.toInt()

        if (tripDistance > 0 ) {
            println("Is discount card displayed? Yes/No or 1")
            val discountCard = readLine().toString()

            if (discountCard == "Yes" || discountCard == "yes" || discountCard == "1") {
                println("Enter the age from the card: ")
                val citizenAge = readLine()!!.toInt()

                if (citizenAge >= 60) {
                    tripCost = (tripDistance * general_fare) - ((tripDistance * general_fare) * 45 ) / 100
                    println("Total cost: $${tripCost.roundToInt()}")
                }
            } else {
                tripCost = (tripDistance * general_fare)
                println("Total cost: $${tripCost.roundToInt()}")
            }
        } else {
            println("Trip distance is required.\n\n")
        }

    } while (tripDistance == 0)
}