fun main() {
    println("Enter your name: ")
    val name = readLine()

    println("Enter age: ")
    val age = readLine()

    //Traditional way to concatenate
    /*val message = "Your name is " + name + " and your age " + age // Option 1

    print("Your name is " + name + " and your age " + age) //Option 1 to concatenate strings
    print(message) //Option 1 to concatenate strings*/

    //Kotlin way - String templates
    val message = "Your name is $name \nand your age $age" //Using scape char to jump line \n
    println(message)

    //Raw string - is used to include arbitraty characters, no need of escaping characters
    println("""
        *** Data ***
        Name: $name
        Age: $age
    """.trimIndent()) //Remove spaces at the beginning of the line

}