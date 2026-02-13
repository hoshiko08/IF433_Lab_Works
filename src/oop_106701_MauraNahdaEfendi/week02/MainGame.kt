package oop_106701_MauraNahdaEfendi.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- MINI RPG BATTLE ---")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage: ")
    val damage = scanner.nextInt()

    val hero = Hero(heroName, damage)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {
        println("\n1. Serang")
        println("2. Kabur")

        when (scanner.nextInt()) {
            1 -> {
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Enemy: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Enemy membalas dengan $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("HP Hero: ${hero.hp}")
                }
            }

            2 -> {
                println("Hero kabur dari pertempuran!")
                break
            }
        }
    }

    println("\nPERTARUNGAN SELESAI")
    if (hero.hp > enemyHp)
        println("${hero.name} MENANG!")
    else if (enemyHp > hero.hp)
        println("ENEMY MENANG!")
    else
        println("SERI!")
}
