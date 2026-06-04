package oop_106701_MauraNahdaEfendi.week14

interface Shape {
    fun area(): Int
}

class Rectangle(
    var width: Int,
    var height: Int
) : Shape {

    override fun area() = width * height
}

class Square(
    var side: Int
) : Shape {

    override fun area() = side * side
}