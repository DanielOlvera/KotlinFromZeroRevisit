package oop.assignments.factory

abstract class Appliance (
    val serialNumber: String,
    var applianceType: ApplianceType,
    var color: Color,
    var weight: Double,
    var price: Double
        ) {

    //With this we increment the counter each time a new instance is created
    init {
        incrementCounter()
    }

    //To hold static properties and methods
    companion object {
        var totalAppliance: Int = 0
            private set // private setter to prevent external modification

        fun incrementCounter() {
            totalAppliance++
        }
    }

    override fun toString(): String {
        return "Serial number: $serialNumber - Tipo: $applianceType - Color: $color - Weight: $weight kg - Price: $price "
    }
}