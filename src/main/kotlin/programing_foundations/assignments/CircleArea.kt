package programing_foundations.assignments

import java.text.DecimalFormat
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    print("Enter the radius in cm: ")
    val radius = readLine()?.toDouble()

    val area = radius?.let { PI.times(it.pow(2))}
    val circumference = radius?.let { PI.times(it).times(2) }

    val areaInInch = radius?.let { PI.times(it.div(2.54).pow(2)) }
    val circumferenceInInch = circumference?.div(2.54)

    val format = "#.##" // To display a max of two decimal positions

    println("""
        
        *** Centimeters ***
        Area           | ${DecimalFormat(format).format(area)}
        Circumference  | ${DecimalFormat(format).format(circumference)}
        
        *** Inches ***
        Area           | ${DecimalFormat(format).format(areaInInch)}
        Circumference  | ${DecimalFormat(format).format(circumferenceInInch)}
    """.trimIndent())
}