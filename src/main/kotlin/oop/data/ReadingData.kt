package oop.data

fun main() {
    val personA = PersonA("Peter", "Parker")

    println(personA.toString())

    val personB = PersonB("Pedro", "Paramo")

    println(personB.toString())

    val personC = personB.copy()

    //We can also make changes to the copied instance
    val personD = personB.copy(name = "Tom")

    println(personC)
    println(personD)

    //Data classes allows us to deconstruct and object
    //We regularly would need to do this
    //val name = personD.name
    //val phone = personD.phone

    //But we can do this way too
    val (name, phone) = personD
    println("$name, $phone")
    //We can access methods defined in the data class from their instances
    println(personD.getLengthOfName())

}