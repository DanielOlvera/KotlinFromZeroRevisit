package oop.assignments.factory

fun main() {

    val washer = Washer("1324rfdf", ApplianceType.WASHER, Color.WHITE, 135.90, 12450.0, 14)
    val microwave = Microwave("1324rfdf", ApplianceType.MICROWAVE, Color.BLACK, 135.90, 12450.0, 14)
    val fridge = Refrigerator("1324rfdf", ApplianceType.REFRIGERATOR, Color.GRAY, 135.90, 12450.0, 4.3, 0, -5)

    val applianceList = arrayListOf(washer, microwave, fridge)

    println("## Appliance Fabrication ## \n")

    for (appliance in applianceList) {
        println("$appliance")
    }

    println("\nTotal appliances fabricated: ${Appliance.totalAppliance}")
}