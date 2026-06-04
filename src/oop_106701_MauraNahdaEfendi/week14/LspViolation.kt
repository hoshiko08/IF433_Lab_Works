package oop_106701_MauraNahdaEfendi.week14

open class Rectangle {
    var width: Int = 0
    var height: Int = 0

    fun area() = width * height
}

class Square : Rectangle() {

    override var width: Int
        get() = super.width
        set(value) {
            super.width = value
            super.height = value
        }

    override var height: Int
        get() = super.height
        set(value) {
            super.width = value
            super.height = value
        }
}