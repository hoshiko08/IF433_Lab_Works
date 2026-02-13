package oop_106701_MauraNahdaEfendi.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM PERPUSTAKAAN ---")

    println("Judul Buku:")
    val title = scanner.nextLine()

    println("Nama Peminjam:")
    val borrower = scanner.nextLine()

    println("Lama Pinjam (hari):")
    val durationInput = scanner.nextInt()

    val validDuration = if (durationInput < 0) 1 else durationInput

    val loan = Loan(title, borrower, validDuration)

    println("Detail Peminjaman:")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}
