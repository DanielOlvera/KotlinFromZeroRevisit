package oop.notes

import java.util.*

fun main() {

    val note1 = Note("Note 1", "This is Note 1", Date())
//    note1.name = "Note 1" //As we make the change to the class in the constructor we can remove the instantiation
//    note1.content = "Some content"

//    println(note1.name)
//    println(note1.content)
//    println(note1.dateCreated)
//
//    note1.name = "Note 2"
//    note1.content = "Updated note"
//
//    println(note1.name)
//    println(note1.content)
//    println(note1.dateCreated)

    val notesList = arrayListOf<Note>()

    notesList.add(note1)

    val note2 = Note("Note 2", "This is Note 2", Date())
//    note2.name = "Note 2"
//    note2.content = "Other content"

    notesList.add(note2)

    //As we have defined as var the properties in the constructor of Note class, we can update the values, if it were
    //val we wouldn't be able to re-assign the value of the property
    notesList[0].name = "Updated Note 1"

    notesList.forEach {
        println("""
            ${it.name}
            ${it.content}
            ${it.dateCreated}
            -------------------------
        """.trimIndent())
    }

    val note3 = Note("Note 3", "Content of Note 3, secondary constructor")

    val note4 = Note("Note 4", "Content of Note 3, primary constructor", Date())

    println(note3.name)
    println(note4.name)

    //Access modifiers
    //public: is the default access modifier
    //internal: this allows to access the elements only in the module/package where is defined
    //private:
    //protected


}