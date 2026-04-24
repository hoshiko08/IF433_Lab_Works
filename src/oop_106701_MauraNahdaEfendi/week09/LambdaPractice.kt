package oop_106701_MauraNahdaEfendi.week09

fun main() {
    // Lambda explicit
    val add: (Int, Int) -> Int = { a, b -> a + b }
    println("Explicit lambda: ${add(5, 3)}")

    // Lambda implicit (it)
    val multiply: (Int) -> Int = { it * 2 }
    println("Implicit lambda: ${multiply(4)}")
}