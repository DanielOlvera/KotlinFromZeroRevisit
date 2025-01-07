package oop.geometry

import kotlin.math.roundToInt

//Multi inheritance is not allowed meaning that we can only add one super type class
//However we can inherit from several interfaces and implement them in a single class

//class Example1 {
//    
//}
class Rectangle(
    identifier: String,
    var base: Double,
    var height: Double
): Polygon(identifier), Polygon2, Graphics /*, Example1()*/ {

    override fun getArea(): Double {
        return base * height
    }

    override fun getPerimeter(): Double {
        return (2 * base) + (2 * height)
    }

    override fun draw() {
        for (i in 1..height.roundToInt()) {
            println(" * ".repeat(base.toInt()))
        }
    }

    fun getAreaInInches(): Double{
        return cmToInch(getArea())
    }

    fun getPerimeterInInches(): Double{
        return cmToInch(getPerimeter())
    }

    override fun getArea2(): Double {
        return base * height
    }

    override fun getPerimeter2(): Double {
        return (2 * base) + (2 * height)
    }

    override fun draw2() {
        for (i in 1..height.roundToInt()) {
            println(" * ".repeat(base.toInt()))
        }
    }
}