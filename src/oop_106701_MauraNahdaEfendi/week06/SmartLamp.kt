package oop_106701_MauraNahdaEfendi.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("$name menyala.") }
    override fun turnoff() { println("$name mati.") }
}