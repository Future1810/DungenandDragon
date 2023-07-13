class Unterboss(name: String, hp: Int, val i: Int) : Gegner(name, hp) {
    override fun aktionen(): List<String> {
        return listOf("Angriff")
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
        val schaden = held.hp - dmg
        println("$name greift ${held.name} an und fügt $dmg Schaden zu.")
        if (schaden <= 0) {
            println("\u001B[31m" + """${held.name} ist tod""" + "\u001B[0m")
            heldenTeam.remove(held)
        } else {
            println("\u001B[35m" + """${held.name}hat noch Lebens Punkte: ${held.hp}""" + "\u001B[0m")
            held.hp -= dmg
        }
    }
}