package oop_106701_MauraNahdaEfendi.week04

fun main() {

    val vehicle = Vehicle("Generic Vehicle")
    vehicle.honk()
    vehicle.accelerate()

    println()

    val car = Car("Toyota", 4)
    car.honk()
    car.accelerate()
    car.openTrunk()

    println()

    val tesla = ElectricCar("Tesla", 4, 100)
    tesla.accelerate()
    tesla.honk()
    tesla.openTrunk()

    println()

    val manager = Manager("Budi", 8000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println()

    val developer = Developer("Andi", 7000000, "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}