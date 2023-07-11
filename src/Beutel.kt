class Beutel {
    private var heiltrankAnzahl: Int = 3
    private var vitaminAnzahl: Int = 1

    fun benutzeHeiltrank(held: Held) {
        if (heiltrankAnzahl > 0) {
            held.heilen(held.maxHp / 2)
            heiltrankAnzahl--
        }
    }

    fun benutzeVitamin(held: Held) {
        if (vitaminAnzahl > 0) {
            held.erhoeheSchadenswert(0.1)
            vitaminAnzahl--
        }
    }
}