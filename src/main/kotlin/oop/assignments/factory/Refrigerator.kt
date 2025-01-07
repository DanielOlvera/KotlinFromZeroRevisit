package oop.assignments.factory

class Refrigerator(
    serialNumber: String,
    applianceType: ApplianceType,
    color: Color,
    weight: Double,
    price: Double,
    var capacity: Double,
    var minTempFridge: Int,
    var minTempFreezer: Int
) : Appliance(serialNumber, applianceType, color, weight, price) {
    override fun toString(): String {
        return super.toString() + "- Capacity: $capacity ft^2 - Minimum Temperature: [$minTempFridge C fridge][$minTempFreezer C freezer]"
    }
}