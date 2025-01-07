package oop.pos.classes

class Administrator (
    name: String,
    lastName: String,
    address: String,
    phone: String?,
    dob: String,
    salary: Double,
    var bonusPercentage: Double
        ): Employee(name, lastName, address, phone, dob, salary) {

    fun getFinalSalary(): Double {
        return salary + ((salary / 100) * bonusPercentage)
    }

    override fun toString(): String {
        return super.toString() + ", Bonus percentage: $bonusPercentage, Total Salary: ${getFinalSalary()}"
    }
}