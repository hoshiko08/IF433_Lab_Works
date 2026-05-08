package oop_106701_MauraNahdaEfendi.week11

class User {

    var name: String = ""
    var age: Int = 0
}
fun main() {

    val user = User().apply {
        name = "Maura"
        age = 20
    }

    println(user.name)
    println(user.age)
}