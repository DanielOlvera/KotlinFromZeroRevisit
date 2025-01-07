package oop.geometry

fun main() {

    //We cannot create an instance from an abstract class
//    val polygon = Polygon()

    val rectangle = Rectangle("rectangle 1", 5.0, 8.0)
    println(rectangle.getArea())
    println(rectangle.getPerimeter())
    println(rectangle.draw())
    println(rectangle.identifier)
    println(rectangle.getAreaInInches())

    val rectangle2 = Rectangle("rectangle 2", 6.0, 9.0)
    println(rectangle2.getArea2())
    println(rectangle2.getPerimeter2())
    println(rectangle2.draw2())
    println(rectangle2.getPerimeterInInches())
    println(rectangle2.cmToInch2(5.0))


}