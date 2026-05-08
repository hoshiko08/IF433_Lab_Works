package oop_106701_MauraNahdaEfendi.week10

fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println(intBox.getItem())
    println(stringBox.getItem())

    val pairBox = PairBox("ID001", "Laptop")

    println(pairBox.getKey())
    println(pairBox.getValue())
}