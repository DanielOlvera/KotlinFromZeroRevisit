package oop.notes

import oop.constants.Constants.MAX_NAME_LENGTH
import java.util.*

//We can use the constructor to avoid instantiation for the attributes
//In the constructor, those parameters are known as instance attributes
class Note(
    var name: String,
    var content: String,
    var dateCreated: Date
) {

    //We can have an initialization block, this will execute every time we create an instance of the class
    init {
        //name  = name.toUpperCase()
        numberOfInstances++

        if (name.length > MAX_NAME_LENGTH) throw Exception("Name can't be more than 10 long")
    }

    //We can crete a secondary constructor
    //Secondary constructors always call the primary constructor
    //In the constructor, Those parameters are known as instance attributes
    constructor(name: String, content: String) : this (name, content, Date()) {
        println("Class instantiated with the secondary constructor")

        //If we want an action to happen only in this constructor we can do it like this:
        this.name = name.toUpperCase()
    }

    // Methods and attributes of the class, they are going to be shared in all the instances of the class
    companion object {
        var numberOfInstances = 0

        fun showNumberOfInstances() {
            println(numberOfInstances)
        }
    }

    /**
     * ALL THE METHODS INSIDE THE CLASS ARE KNOWN AS INSTANCE METHODS AS THEY'LL BE COMMON TO ALL INSTANCES
     * OF THE CLASS, but the values will be unique for each instance
     */

    /**
     * Counts the number of characters in the string
     */
    fun printTotalCharacterContent() {
        println(content.length)
    }

    fun printTotalWordContent(): Int {
        val count = content.split(" ")
        return count.size
    }

    //Method overload
    fun printTotalWordContent(word: String): Int {
        val wordCount = content.split(" ")
        var count = 0

        //To prevent cases were the word can have upper and lower case we will convert all to uppercase
        wordCount.forEach {
//            if (it.toUpperCase() == word.toUpperCase()) count++ //Is the same as below
            if (it.equals(word, ignoreCase = true)) count++
        }

        return count
    }

}