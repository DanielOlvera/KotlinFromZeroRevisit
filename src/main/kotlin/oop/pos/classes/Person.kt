package oop.pos.classes

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

open class Person(
    var name: String,
    var lastName: String,
    var address: String,
    var phone: String?,
    var dob: String
) {

    var dobDate: LocalDate = LocalDate.parse(dob, DateTimeFormatter.ofPattern(DATE_FORMAT))

    companion object {
        const val DATE_FORMAT = "MM/dd/yyy"
    }

    fun getAge(): Int {
        return Period.between(dobDate, LocalDate.now()).years
    }

    //Overrides from parent class Any
    override fun toString(): String {
        return "Name: $name, Lastname: $lastName, Address: $address, PHone: ${phone ?: "N/A"}, DOB: $dob, Age: ${getAge()}"
    }
}