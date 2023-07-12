class Magier(name: String, maxHp: Int) : Held(name, maxHp) {
    override fun aktionen(): List<String> {
        return super.aktionen() + "3. Feuerball"
    }

    override fun aktionen1(): List<String> {
        return super.aktionen() + "4.Heilen"
    }

    override fun aktionAusfuehren(aktion: String, ziel: Gegner) {
        when (aktion) {
            "1" -> angriff(ziel)
            "2" -> verteidigen()
            "3" -> feuerball(ziel)
            "4" -> heilen(i = 20)
            else -> super.aktionAusfuehren(aktion, ziel)
        }
    }


    private fun feuerball(ziel: Gegner) {
        val dmg = (20..40).random()
        ziel.hp -= dmg
        println("$name wirft einen Feuerball und fügt $dmg Schaden zu.")
    }
}