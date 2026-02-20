package oop_106701_MauraNahdaEfendi.week03

fun main() {
    val e = Employee()
    e.name = "Budi"

    e.salary = -1000
    e.salary = 5000

    e.updatePerformanceRating(4)

    println("Nama: ${e.name}")
    println("Salary: ${e.salary}")
    println("Bonus: ${e.bonus}")
}