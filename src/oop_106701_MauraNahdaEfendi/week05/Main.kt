package oop_106701_MauraNahdaEfendi.week05

fun main() {
    // --- BAGIAN GUIDED (PEGAWAI) ---
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("")
    }

    // --- TUGAS MANDIRI 1: MATHHELPER (CHECKPOINT 6) ---
    // Di sini kita membuat objek MathHelper untuk memanggil fungsi hitungLuas
    val math = MathHelper()

    // 1. Menguji hitungLuas persegi (1 parameter Int) [cite: 83]
    val luasPersegi = math.hitungLuas(5)
    println("Hasil MathHelper - Luas Persegi (sisi 5): $luasPersegi")

    // 2. Menguji hitungLuas persegi panjang (2 parameter Int) [cite: 84]
    val luasPP = math.hitungLuas(5, 10)
    println("Hasil MathHelper - Luas Persegi Panjang (5x10): $luasPP")

    // 3. Menguji hitungLuas lingkaran (1 parameter Double) [cite: 85]
    val luasLingkaran = math.hitungLuas(7.0)
    println("Hasil MathHelper - Luas Lingkaran (r 7.0): $luasLingkaran")

    // --- TUGAS MANDIRI 2 ---
    println("\n=== SISTEM PEMBAYARAN ===")
    val myEWallet = EWallet("John's Dana", 50000.0)
    val myCreditCard = CreditCard("John's Visa", 100000.0)

    val listPayment: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in listPayment) {
        payment.processPayment(75000.0)

        // Smart Casting Challenge
        if (payment is EWallet) {
            payment.topUp(50000.0)
            payment.processPayment(75000.0)
        }
    }
}