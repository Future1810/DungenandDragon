open class Held(val name: String, var maxHp: Int, var hp: Int = maxHp) {
    open fun aktionen(): List<String> {
        return listOf("1. Angriff", "2. Verteidigen", "4.Heiltrank")
    }
    open fun aktionen1(): List<String> {
        return listOf("1. Angriff", "2. Verteidigen ","3.Feuerball")
    }


    open fun aktionAusfuehren(aktion: String, ziel: Gegner) {
        when (aktion) {
            "1" -> angriff(ziel)
            "2" -> verteidigen()

            else -> println("Ungültige Aktion!")
        }
    }



    open fun angriff(ziel: Gegner) {
        val dmg = (10..20).random()
        ziel.hp -= dmg
        println("\u001B[32m" + """$name greift ${ziel.name} an und fügt $dmg Schaden zu.""" + "\u001B[0m")
    }

    open fun verteidigen() {
        println("$name verteidigt sich.")
    }

    open fun heilen(i: Int) {
        hp = minOf(hp + i, maxHp)
        println("$name hat sich um $i geheilt. Aktuelle HP: $hp/$maxHp")
    }


    open fun erhoeheSchadenswert(factor: Double) {

    }




}
