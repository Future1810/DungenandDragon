open class Held(val name: String, var maxHp: Int, var hp: Int = maxHp) {
    open fun aktionen(): List<String> {
        return listOf("1. Angriff", "2. Verteidigen")
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
        println("$name greift ${ziel.name} an und fügt $dmg Schaden zu.")
    }

    open fun verteidigen() {
        println("$name verteidigt sich.")
    }

    open fun heilen(amount: Int) {
        hp = minOf(hp + amount, maxHp)
        println("$name hat sich um $amount geheilt. Aktuelle HP: $hp/$maxHp")
    }

    open fun erhoeheSchadenswert(factor: Double) {

    }




}
