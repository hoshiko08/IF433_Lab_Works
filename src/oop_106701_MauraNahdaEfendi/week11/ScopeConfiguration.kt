package oop_106701_MauraNahdaEfendi.week11

class User {

    var name: String = ""
    var age: Int = 0
}

fun main() {

    val user = User().apply {
        name = "Maura"
        age = 20
    }.also {
        println("User created: ${it.name}")
    }

    with(user) {
        println(name)
        println(age)
    }
}