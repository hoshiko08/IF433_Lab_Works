package oop_106701_MauraNahdaEfendi.week04

open class Vehicle(val brand: String) {

    open fun honk() {
        println("$brand berbunyi: Toot!")
    }

    open fun accelerate() {
        println("$brand sedang berakselerasi.")
    }
}