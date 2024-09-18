fun main() {
    //Mutable variables are defined with 'var'
    //The string keyword as Kotlin is smart enough to infer the data type
    var country: String = "Mexico"

    //Non-mutable variables are defined with 'val'
    val city: String = "San Francisco"

    println(country)
    println(city)

    //Data types Primitive
    //In Kotlin all are objects regardless if they are called as primitives
    val thisIsALong: Long = 1324123412341230233
    val thisIsAnInt: Int = 234123423
    val thisIsAShort: Short = 4234
    val thisIsAByte: Byte = 42

    println("This is a Long : $thisIsALong")
    println("This is an Int : $thisIsAnInt")
    println("This is a Short : $thisIsAShort")
    println("This is a Byte : $thisIsAByte")

    //Data types Primitive - Floating point
    //The main difference here is the presition in which the value is presented
    val pi = 3.14159256359 //This indicated the compiler is Double type
    val piFloat = 3.14159256359f //This indicated the compiler is a Float type

    println("This is a Double pi: $pi")
    println("This is a Float pi : $piFloat")

    //Data types - Char and String
    //Char represents a single character and are defined with single quotes ' ', example: 'k'
    //Strings are formed by the concatenation of characters and are defined with double quotes " ", example: "Kotlin"
    val thisIsAChar: Char = 'K'
    val thisIsAString: String = "Kotlin"

    println("This is a char: $thisIsAChar")
    println("This is a String: $thisIsAString")

    //Data type - Boolean (logical data type)
    //This type take only two states: true or false
    val logicType = false
    println("This is a Boolean: $logicType")

}