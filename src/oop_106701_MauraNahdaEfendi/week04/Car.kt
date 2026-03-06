package oop_106701_MauraNahdaEfendi.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    override fun honk() {
        println("$brand berbunyi: Beep Beep!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand melaju lebih cepat di jalan raya.")
    }

    fun openTrunk() {
        println("Bagasi $brand terbuka.")
    }
}