package oop.auto

import oop.constants.Constants
import oop.notes.Note
import java.util.*


//TODO: Need to verify why is not taking Auto from module
fun main() {

    //At first, we can't reference this Auto class as belongs to a different module
//    val auto = Auto("BMW")
//
//    println(auto.brand)
    Plane()

    val message = "Hello world"

    println(message.toUpperCase())

    val note = Note("Note 5", "Content of note 5")

    note.printTotalCharacterContent()
    println(note.printTotalWordContent())
    println(note.printTotalWordContent())
    println(note.printTotalWordContent("note"))

    println(Note.numberOfInstances)

    val note1 = Note("Note 6", "Content of note 6", Date())

    // We can't access to the property as it is belongs to the class not to the instance
//    println(note1.numberOfInstances)
    //then what we do is
    println(Note.numberOfInstances)

    Note.showNumberOfInstances()

//    println(Note.MAX_NAME_LENGTH)

    //We can also use from an object outsiede from a class
    println(Constants.MAX_NAME_LENGTH)
}

//For this one to create inheritance we need to mark it as open as by default all classes in kotlin are final so
//other classes cannot inherit
//If we were adding the private modifier no one out of the Aircraf to class could access the passengersNumber property
//protected allows me to access in the class and subclasses
open class Aircraft(protected var passengersNumber: Int) {
    init {
        println(passengersNumber)
    }
}


class Plane : Aircraft(50) {

    init {
        println(passengersNumber)
    }
}
