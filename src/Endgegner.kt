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

    override fun flaechenschaden(helden: List<Held>) {
        val dmg = (10..40).random()
        val toteHelden = mutableListOf<Held>()
        println("$name verursacht Flächenschaden!")
        for (held in helden) {
            held.hp -= dmg
            if (held.hp <= 0) {
                println("\u001B[31m" + """${held.name} ist tod""" + "\u001B[0m")
                toteHelden.add(held)

            } else {

                println("\u001B[35m" + """${held.name}hat noch Lebens Punkte: ${held.hp}""" + "\u001B[0m")
                held.hp -= dmg
            }


        }
        heldenTeam.removeAll(toteHelden)
    }

    override fun fluch(helden: List<Held>) {
        val held = helden.random()
        val dmg = (5..10).random()
        val schaden = held.hp - dmg
        println("$name verflucht ${held.name}!")

        if (schaden <= 0) {
            println("\u001B[31m" + """${held.name} ist tod""" + "\u001B[0m")
            heldenTeam.remove(held)
        } else {
            println("${held.name}hat noch Lebens Punkte: ${held.hp}")
            held.hp -= dmg
        }
    }

    override fun beschwoerung() {
        println("$name kann keinen Unterboss beschwören!")
    }
}