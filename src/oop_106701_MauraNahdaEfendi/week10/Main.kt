package oop_106701_MauraNahdaEfendi.week10

fun main() {

    val intBox = Box(100)
    val stringBox = Box("Hello Kotlin")

    println(intBox.getItem())
    println(stringBox.getItem())

    val pairBox = PairBox("ID001", "Laptop")

    println(pairBox.getKey())
    println(pairBox.getValue())

    printData(99.9)
    printData("Generic Function")

    println(getData(88.8))
    println(getData("Kotlin"))

    val numericalStorage = NumericalStorage(10)

    println(numericalStorage.square())

    println(compareValues(10, 20))
    println(compareValues("Apple", "Banana"))
}