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

    private var performanceRating: Int = 0

    fun updatePerformanceRating(newRating: Int) {
        if (newRating in 1..5) {
            performanceRating = newRating
        } else {
            println("Rating harus antara 1 sampai 5")
        }
    }
}