package oop.geometry

//Interfaces don't take constructors
//Interfaces cannot have a constructor
//Cannot have a state, all properties must override in the classes that inherit from them
//They allow simulating multi inheritance with some limitations, this because in Kotlin a class can only inherit from another one class
//In an interface all methods and variables defined there are by default abstract
//All variables and methods in an interface are public by default and won't take any other modifier than private
interface Polygon2 {

    fun getArea2(): Double
    fun getPerimeter2(): Double

    fun cmToInch2(value: Double): Double {
        return (1 / 2.54) * value
    }
}