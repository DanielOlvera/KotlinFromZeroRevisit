package oop.pos

import oop.pos.classes.Administrator
import oop.pos.classes.Employee
import oop.pos.classes.Person

fun main() {

    val person = Person("Peter", "Parker", "Known", null, "01/25/1990")

    //To get the age from this person
    println(person.getAge())
    println(person.toString())

    val employee = Employee("Alberto", "Bernal", "Known", "234523452", "04/08/1987", 5000.0)

    //As it is inheriting from Person I can have access to the properties and attributes of the parent class
    println(employee.toString())
    println(employee.getAge())
    println(employee.salary)

    val admin = Administrator("Tom", "Cat", "Known", "23452354", "02/06/1977", 5500.0, 10.0)

    println(admin.toString())
}