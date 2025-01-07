package oop.assignments.factory

class Microwave(
    serialNumber: String,
    applianceType: ApplianceType,
    color: Color,
    weight: Double,
    price: Double,
    var power: Int
) : Appliance(serialNumber, applianceType, color, weight, price) {
    override fun toString(): String {
        return super.toString() + "- Power: $power watts"
    }
}