package oop_106701_MauraNahdaEfendi.week05

class MathHelper {
    // Overloading: Nama sama, parameter berbeda
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}