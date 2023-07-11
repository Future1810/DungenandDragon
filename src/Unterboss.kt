class Unterboss(name: String, hp: Int, val i: Int) : Gegner(name, hp) {
    override fun aktionen(): List<String> {
        return listOf("Angriff", "Verteidigen", "Heilen")
    }

    override fun aktionAusfuehren(aktion: String, helden: List<Held>) {
        when (aktion) {
            "Angriff" -> angriff(helden)
            else -> super.aktionAusfuehren(aktion, helden)
        }
    }

    override fun angriff(helden: List<Held>) {
        val held = helden.random()
        val dmg = (10..20).random()
        held.hp -= dmg
        println("$name greift ${held.name} an und fügt $dmg Schaden zu.")
    }
}