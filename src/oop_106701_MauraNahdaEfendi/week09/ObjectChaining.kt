package oop_106701_MauraNahdaEfendi.week09

data class Student(val name: String, val grade: Int)

fun main() {
    val students = listOf(
        Student("Alice", 85),
        Student("Bob", 70),
        Student("Charlie", 90),
        Student("Diana", 60)
    )
    val result = students
        .filter { it.grade >= 75 }
        .sortedByDescending { it.grade }
        .map { "${it.name} - ${it.grade}" }

    result.forEach {
        println(it)
    }
}