package oop_106701_MauraNahdaEfendi.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")
    val squaredNumbers = numbers.map { it * it }
    println("Squared numbers: $squaredNumbers")
    val sortedDesc = numbers.sortedByDescending { it }
    println("Sorted Descending: $sortedDesc")

    sortedDesc.forEach {
        println("Value: $it")
    }
}