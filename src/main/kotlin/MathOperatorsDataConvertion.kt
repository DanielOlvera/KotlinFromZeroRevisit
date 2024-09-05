import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main() {
//    val num = 10.0

    //Math operators
//    val result = num + 10
//    val result = num * 10
//    val result = num - 10
//    val result = num / 10
//    val result = num % 4.0 // Modulus

    //The hierarchy followed is the same as in regular Math
    val result = (35 - 15) / 5

    // Assignation operators, they serve to prevent duplication of operations
    // = , +=, -=, *=, /=, %=
    var num = 10

//    num = num + 5
//    num += 5

    //Increment and decrease operators
    // ++, --
    num++; //Useful for basic increments and counters

    //Postfix: First uses the variable and then increments, by example: num++
    // For example this -println(num++)- will print 10 which is the current value of num
    // If we print again using println(num) now the variable value has increased in one and will display 11

    //Prefix: First increments and then uses the variable, by example: ++num
    // For example this -println(--num)- will print 11 which is the increased value of num
    // If we print again using println(num) now the will display 11 which is the current value of num

    println(result)
    println(num)

    //Data type conversion
    val value = "5"
//    val result = value * 5 //This won't succeed as we can't operate values of different types
    //Instead we do convert to the corresponding data type:
    val result2 = value.toInt() * 5
    println(result2)

    //Formatting numbers
    val pi = 3.14159
    println(round(pi))

    val num2 = 3.9
    val num3 = 3.1

    //If we want to always round to next lower digit
    println(floor(num2))

    //If we want to always round to next upper digit
    println(ceil(num3))

    //Decimal positions
//    println(DecimalFormat().format(pi)) // Default format
    println(DecimalFormat("#.#").format(pi)) //With a given pattern
    // #.# means one integer and one decimal, we can change those as needed
}