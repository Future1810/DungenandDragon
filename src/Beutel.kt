open class Beutel {
    private var heiltrankAnzahl: Int = 6
    private var vitaminAnzahl: Int = 5

    fun benutzeHeiltrank(held: Held) {
        if (heiltrankAnzahl > 0) {
            held.heilen(i = 20)
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