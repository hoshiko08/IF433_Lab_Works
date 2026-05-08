package oop_106701_MauraNahdaEfendi.week11

fun main() {

    val name: String? = "Maura"

    name?.let {
        println("Length: ${it.length}")
    }

    val result = run {
        val a = 10
        val b = 20
        a + b
    }

    println(result)
}