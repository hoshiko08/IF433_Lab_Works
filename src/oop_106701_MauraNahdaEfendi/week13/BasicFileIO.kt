package oop_106701_MauraNahdaEfendi.week13

import java.io.File

fun main() {
    val file = File("journal.txt")

    file.writeText("Hari ini belajar File I/O di Kotlin.\n")

    file.appendText("Besok belajar Data Serialization.\n")
}