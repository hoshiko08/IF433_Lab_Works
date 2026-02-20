package oop_106701_MauraNahdaEfendi.week03

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50
    weapon.damage = 9999

    println("Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}