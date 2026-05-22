package oop_106701_MauraNahdaEfendi.week13

import java.io.File
import java.io.PrintWriter

fun main() {
    val writer = PrintWriter(File("manual_close.txt"))

    writer.println("Belajar manual close stream.")
    writer.println("Jangan lupa ditutup!")

    writer.close()

    File("safe_use.txt").printWriter().use { writerSafe ->
        writerSafe.println("Menulis file dengan use block.")
        writerSafe.println("Resource otomatis ditutup.")
    }

    File("safe_use.txt").bufferedReader().use { reader ->
        reader.forEachLine {
            println(it)
        }
    }
}