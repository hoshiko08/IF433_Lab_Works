package oop_106701_MauraNahdaEfendi.week09

data class Student(val name: String, val grade: Int)

fun main() {
    val students = listOf(
        Student("Alice", 85),
        Student("Bob", 70),
        Student("Charlie", 90),
        Student("Diana", 60)
    )