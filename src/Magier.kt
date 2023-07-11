class Magier(name: String, maxHp: Int) : Held(name, maxHp) {
    override fun aktionen(): List<String> {
        return super.aktionen() +  "3. Feuerball"
    }

    override fun aktionAusfuehren(aktion: String, ziel: Gegner) {
        when (aktion) {
            "1" -> angriff(ziel)
            "2" -> Beutel()
            "3" -> feuerball(ziel)
            else -> super.aktionAusfuehren(aktion, ziel)
        }
    }


    private fun feuerball(ziel: Gegner) {
        val dmg = (20..40).random()
        ziel.hp -= dmg
        println("$name wirft einen Feuerball und fügt $dmg Schaden zu.")
    }

}
