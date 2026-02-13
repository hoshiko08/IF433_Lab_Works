package oop_106701_MauraNahdaEfendi.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")

    println("Masukan Nama:")
    val name = scanner.nextLine()

    println("Masukan NIM (Wajib 5 karakter):")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {

        println("Pilih Jalur Pendaftaran:")
        println("1. Dengan Jurusan")
        println("2. Tanpa Jurusan")

        when (scanner.nextInt()) {
            1 -> {
                scanner.nextLine()
                println("Masukan Jurusan:")
                val major = scanner.nextLine()

                val s1 = Student(name, nim, major)
                println("Status: Pendaftaran Selesai")
            }

            2 -> {
                val s1 = Student(name, nim)
                println("Status: Pendaftaran Tanpa Jurusan Selesai")
            }

            else -> {
                println("Pilihan tidak valid")
            }
        }
    }
}
