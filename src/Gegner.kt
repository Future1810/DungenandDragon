open class Gegner(val name: String, var hp: Int) {
    open fun aktionen(): List<String> {
        return listOf("Angriff", "Flächenschaden", "Fluch", "Beschwörung")
    }

    open fun aktionAusfuehren(aktion: String, helden: List<Held>) {
        when (aktion) {
            "Angriff" -> angriff(helden)
            "Flächenschaden" -> flaechenschaden(helden)
            "Fluch" -> fluch(helden)
            "Beschwörung" -> beschwoerung()
            else -> println("$name: Ungültige Aktion!")
        }
    }

    open fun angriff(helden: List<Held>) {
        val held = helden.random()
        val dmg = (10..20).random()
        held.hp -= dmg
        println("$name greift ${held.name} an und fügt $dmg Schaden zu.")
    }

    open fun flaechenschaden(helden: List<Held>) {
        val dmg = (10..20).random()
        for (held in helden) {
            held.hp -= dmg
        }
        println("$name verursacht Flächenschaden!")
    }

    open fun fluch(helden: List<Held>) {
        val held = helden.random()
        println("$name verflucht ${held.name}!")
    }

    open fun beschwoerung() {
        println("$name kann keinen Unterboss beschwören!")
    }
}
