package oop_106701_MauraNahdaEfendi.week14

interface Database {
    fun query(sql: String): List<String>
}

class PostgresDatabase : Database {

    override fun query(sql: String): List<String> =
        listOf()
}

class SafeUserService(
    private val db: Database
) {

    fun getUser(id: Int) =
        db.query("SELECT * FROM users WHERE id = $id")
}