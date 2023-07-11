fun main() {
    println("\u001B[31m" + """
        
                ██████╗░██╗░░░██╗███╗░░██╗░██████╗░███████╗███╗░░██╗  ░░░░░░░  ██████╗░██████╗░░█████╗░░██████╗░░█████╗░███╗░░██╗
                ██╔══██╗██║░░░██║████╗░██║██╔════╝░██╔════╝████╗░██║  ░░██╗░░  ██╔══██╗██╔══██╗██╔══██╗██╔════╝░██╔══██╗████╗░██║
                ██║░░██║██║░░░██║██╔██╗██║██║░░██╗░█████╗░░██╔██╗██║  ██████╗  ██║░░██║██████╔╝███████║██║░░██╗░██║░░██║██╔██╗██║
                ██║░░██║██║░░░██║██║╚████║██║░░╚██╗██╔══╝░░██║╚████║  ╚═██╔═╝  ██║░░██║██╔══██╗██╔══██║██║░░╚██╗██║░░██║██║╚████║
                ██████╔╝╚██████╔╝██║░╚███║╚██████╔╝███████╗██║░╚███║  ░░╚═╝░░  ██████╔╝██║░░██║██║░░██║╚██████╔╝╚█████╔╝██║░╚███║
                ╚═════╝░░╚═════╝░╚═╝░░╚══╝░╚═════╝░╚══════╝╚═╝░░╚══╝  ░░░░░░░  ╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░░╚════╝░╚═╝░░╚══╝"""+ "\u001B[0m")


    Thread.sleep(5000)
    (anmelden())

}




fun anmelden() {
    var optionen = listOf(
        "Einloggen",
        "Programm beenden"
    )

    for (i in optionen.indices) {
        println("Drücken sie ${i + 1} für ${optionen[i]}")
    }

    when (readln()) {
        "1" -> {
            //optionen()
            namen()
        }
        "2" -> {
            System.exit(0)
        }

        else -> {
            println("Ungültige Eingabe")
        }

    }


}
fun namen() {
    var versuche = 0
    var userLoggedIn = false

    while (versuche < 3 && !userLoggedIn) {
        println("geben sie ihr Name ein:")
        var log = readln()
        if (log == "Future") {
            userLoggedIn = true
        } else {
            println("Falsches Passwort. noch 2 Versuch ")
            versuche++
        }
    } // Ende der Schleife

    if (versuche == 3) {
        println("Kein Zugriff, Programm wird geschlossen")
    }
    if (userLoggedIn) {

    }
    (LogIn())
}


fun LogIn() {
    var versuche = 0
    var userLoggedIn = false

    while (versuche < 3 && !userLoggedIn) {
        println("geben sie ihr Passwort ein:")
        var pw = readln()
        if (pw == "123456") {
            userLoggedIn = true
        } else {
            println("Falsches Passwort. noch 2 Versuch ")
            versuche++
        }
    }

    if (versuche == 3) {
        println("Kein Zugriff, Programm wird geschlossen")
    }
    if (userLoggedIn) {

    }
    (Game())
}





fun Game() {

    val held1 = Krieger("Kokosnuss", 200)
    val held2 = Ritter("Lanzelott", 300)
    val held3 = Magier("Merlin", 150)

    val beutel = Beutel()
    val endgegner = Endgegner("Endgegner", 500, 500)

    val runden = 6
    var count = 0
    val heldenTeam = listOf(held1, held2, held3)

    while (heldenTeam.isNotEmpty() && endgegner.hp > 100 && count <= runden) {
        println("Runde $count:")
        for (held in heldenTeam) {
            println("${held.name} ist am Zug.")
            println("Verfügbare Aktionen: ${held.aktionen().joinToString()}")
            println("Wähle eine Aktion:")
            val aktion: String = readLine() ?: ""
            when (aktion) {
                "1" -> held.aktionAusfuehren(aktion, endgegner)
                "2" -> held.aktionAusfuehren(aktion, endgegner)
                "3" -> held.aktionAusfuehren(aktion, endgegner)
                "4" -> beutel.benutzeHeiltrank(held)
                "5" -> beutel.benutzeVitamin(held)
                else -> println("Ungültige Aktion!")
            }

            println("Endgegner ist am Zug.")
            endgegner.aktionAusfuehren(endgegner.aktionen().random(), heldenTeam)
            println("Endgegner hat Schaden bekommen: ${endgegner.hp}")

            if (endgegner.hp <= (endgegner.maxHp / 2)) {
                println("Unterboss ist am Zug.")
                val unterboss = Unterboss("Unterboss", 200, 1)
                unterboss.aktionAusfuehren(unterboss.aktionen().random(), heldenTeam)
                println()
            }
        }

        if (heldenTeam.isEmpty()) {
            println("Du hast verloren! Das Helden-Team wurde besiegt.")
        } else {
            println("Du hast gewonnen! Der Endgegner wurde besiegt.")
        }
        count++
    }
}
