package oop_106701_MauraNahdaEfendi.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")