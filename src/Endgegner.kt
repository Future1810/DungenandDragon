class Endgegner(name: String, hp: Int, val maxHp: Int) : Gegner(name, hp) {
    override fun aktionen(): List<String> {
        return listOf("Angriff", "Flächenschaden", "Fluch", "Beschwörung")
    }

    override fun aktionAusfuehren(aktion: String, helden: List<Held>) {
        when (aktion) {
            "Angriff" -> angriff(helden)
            "Flächenschaden" -> flaechenschaden(helden)
            "Fluch" -> fluch(helden)
            "Beschwörung" -> beschwoerung()
            else -> super.aktionAusfuehren(aktion, helden)
        }
    }

    override fun angriff(helden: List<Held>) {
        val held = helden.random()
        val dmg = (10..30).random()
        held.hp -= dmg
        println("$name greift ${held.name} an und fügt $dmg Schaden zu.")
    }

    override fun flaechenschaden(helden: List<Held>) {
        val dmg = (10..40).random()
        for (held in helden) {
            held.hp -= dmg
        }
        println("$name verursacht Flächenschaden!")
    }

    override fun fluch(helden: List<Held>) {
        val held = helden.random()
        println("$name verflucht ${held.name}!")
    }

    override fun beschwoerung() {
        println("$name kann keinen Unterboss beschwören!")
    }
}