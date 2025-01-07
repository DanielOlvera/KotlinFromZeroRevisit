package oop.assignments.factory

class Washer (
    serialNumber: String,
    applianceType: ApplianceType,
    color: Color,
    weight: Double,
    price: Double,
    var loadSize: Int
        ) : Appliance(serialNumber, applianceType, color, weight, price) {

    override fun toString(): String {
        return super.toString() + "- Capacity: $loadSize kg"
    }
}