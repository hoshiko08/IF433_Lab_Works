package oop_106701_MauraNahdaEfendi.week03

class Employee {
    var name: String = ""

    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("Salary tidak boleh negatif!")
            } else {
                field = value
            }
        }
}