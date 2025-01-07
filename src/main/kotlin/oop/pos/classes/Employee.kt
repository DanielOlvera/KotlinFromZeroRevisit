package oop.pos.classes

//We don't need to use var or val to the properties required for the parent class as they'll be conflicting with
//the parents properties, but what I can do is to create new properties for this class, by examploe, salary which is
//a property for an employee not for a person

//If we create a new class that inherits from Employee is going to inherit from Employee and from Person
open class Employee(
    name: String,
    lastName: String,
    address: String,
    phone: String?,
    dob: String,
    var salary: Double //Here we do need var or val to have access to the attribute
) : Person(name, lastName, address, phone, dob) {

    override fun toString(): String {
        return super.toString() + ", Salary: $salary"
    }
}