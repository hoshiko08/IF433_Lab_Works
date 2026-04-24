package oop_106701_MauraNahdaEfendi.week09

fun main() {
    // Immutable List (Read-Only)
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $fruits")

    // Mutable List (Bisa diubah)
    val mutableFruits = mutableListOf("Apple", "Banana", "Cherry")
    mutableFruits.add("Orange")
    mutableFruits.remove("Banana")

    println("Mutable List after changes: $mutableFruits")
}