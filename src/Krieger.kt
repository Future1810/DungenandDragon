class Krieger(name: String, maxHp: Int) : Held(name, maxHp) {
    override fun aktionen(): List<String> {
        return super.aktionen() + "3. Schwertkampf"
    }

    override fun aktionAusfuehren(aktion: String, ziel: Gegner) {
        when (aktion) {
            "3" -> schwertkampf(ziel)
            else -> super.aktionAusfuehren(aktion, ziel)
        }
    }

    private fun schwertkampf(ziel: Gegner) {
        val dmg = (20..30).random()
        ziel.hp -= dmg
        println("$name greift mit Schwert an und fügt $dmg Schaden zu.")
    }
}
