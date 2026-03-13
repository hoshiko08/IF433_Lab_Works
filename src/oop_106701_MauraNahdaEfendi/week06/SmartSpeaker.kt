package oop_106701_MauraNahdaEfendi.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("$name (Smart Speaker) Aktif.") }
    override fun turnoff() { println("$name (Smart Speaker) Standby.") }
    fun playMusic(song: String) { println("Memutar lagu $song dari Spotify.") }
}