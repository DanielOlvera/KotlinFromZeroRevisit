package oop.geometry

//Abstract classes are going to help to create inheritance, we cannot create instances/objects from and all the
//methods named as abstract and variables have to be implemented in the class that is inheriting from them
//Abstract classes can have a constructor
abstract class Polygon(val identifier: String) {
    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double
    abstract fun draw()

    protected fun cmToInch(value: Double): Double {
        return (1 / 2.54) * value
    }
}