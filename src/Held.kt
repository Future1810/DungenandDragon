open class Held(val name: String, var maxHp: Int, var hp: Int = maxHp) {
    open fun aktionen(): List<String> {
        return listOf("1. Angriff", "2. Verteidigen","3.Heiltrank")
    }
    open fun aktionen1(): List<String> {
        return listOf("1. Angriff", "2. Verteidigen ","4.Feuerball")
    }


    open fun aktionAusfuehren(aktion: String, ziel: Gegner) {
        when (aktion) {
            "1" -> angriff(ziel)
            "2" -> verteidigen()
            "3" -> heilen(i = 20)
            "4" -> schwertkampf(ziel = endgegner)
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
    open fun schwertkampf(ziel: Gegner) {
        val dmg = (20..30).random()
        ziel.hp -= dmg
        println("$name greift mit Schwert an und fügt $dmg Schaden zu.")
    }


    open fun erhoeheSchadenswert(factor: Double) {

    }




}
