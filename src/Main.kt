
val held1 = Krieger("Kokosnuss", 200)
val held2 = Ritter("Lanzelott", 300)
val held3 = Magier("Merlin", 150)
val heldenTeam = mutableListOf(held1, held2, held3)
val endgegner = Endgegner("Eragon", 400, 500)
val unterboss = Unterboss("Unterboss", 200, 300)
val gegnaTeam = mutableListOf(endgegner)
fun main() {
    println("\u001B[31m" + """
        
                ██████╗░██╗░░░██╗███╗░░██╗░██████╗░███████╗███╗░░██╗  ░░░░░░░  ██████╗░██████╗░░█████╗░░██████╗░░█████╗░███╗░░██╗
                ██╔══██╗██║░░░██║████╗░██║██╔════╝░██╔════╝████╗░██║  ░░██╗░░  ██╔══██╗██╔══██╗██╔══██╗██╔════╝░██╔══██╗████╗░██║
                ██║░░██║██║░░░██║██╔██╗██║██║░░██╗░█████╗░░██╔██╗██║  ██████╗  ██║░░██║██████╔╝███████║██║░░██╗░██║░░██║██╔██╗██║
                ██║░░██║██║░░░██║██║╚████║██║░░╚██╗██╔══╝░░██║╚████║  ╚═██╔═╝  ██║░░██║██╔══██╗██╔══██║██║░░╚██╗██║░░██║██║╚████║
                ██████╔╝╚██████╔╝██║░╚███║╚██████╔╝███████╗██║░╚███║  ░░╚═╝░░  ██████╔╝██║░░██║██║░░██║╚██████╔╝╚█████╔╝██║░╚███║
                ╚═════╝░░╚═════╝░╚═╝░░╚══╝░╚═════╝░╚══════╝╚═╝░░╚══╝  ░░░░░░░  ╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚═════╝░░╚════╝░╚═╝░░╚══╝""" + "\u001B[0m")


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
    println("\u001B[34m" + """
                  ░█▀▀▄ █▀▀█ █▀▀ 　 ▀▀█▀▀ █▀▀ █▀▀█ █▀▄▀█ 　 ░█▀▀█ █▀▀ █▀▀ ▀▀█▀▀ █▀▀ █  █ ▀▀█▀▀ 　 █▀▀█ █  █ █▀▀ 
                  ░█ ░█ █▄▄█ ▀▀█ 　  ░█   █▀▀ █▄▄█ █ ▀ █ 　 ░█▀▀▄ █▀▀ ▀▀█   █   █▀▀ █▀▀█   █   　 █▄▄█ █  █ ▀▀█ 
                  ░█▄▄▀ ▀  ▀ ▀▀▀ 　  ░█   ▀▀▀ ▀  ▀ ▀   ▀ 　 ░█▄▄█ ▀▀▀ ▀▀▀   ▀   ▀▀▀ ▀  ▀   ▀   　 ▀  ▀  ▀▀▀ ▀▀▀"""+ "\u001B[0m\n")


    println("            Der Krieger = Kokosnuss              Der Ritter = Lanzelott              Der Magier = Merlin \n            Fähigkeit: Angrif,Schwertkaff        Fähigkeit: Angrif,Schwertkaff       Fähigkeit: Angrif,Heilen,Feuerball\n            Lebens hp = 200                      Lebens hp = 300                     Lebens hp = 150    \n")

    println("\u001B[34m" + """
       ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── 
       ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀ ▀▀
       ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── ── """+ "\u001B[0m\n")

    Thread.sleep(3000)


    val beutel = Beutel()


    var count = 1




    do {
        println("Runde $count:")

        if (heldenTeam.isEmpty()) {
            println("Du hast verloren! Das Helden-Team wurde besiegt.")
            break
        } else if (unterboss.hp <= 0 && endgegner.hp <= 0) {
            println("Du hast gewonnen! Eragon wurde besiegt.")
            break
        }


        for (held in heldenTeam) {
            println("${held.name} ist am Zug.")
            println("Verfügbare Aktionen: ${held.aktionen().joinToString()}")
            println("Wähle eine Aktion:")
            val aktion: String = readln() ?: ""
            when (aktion) {
                "1" -> held.aktionAusfuehren(aktion, endgegner)
                "2" -> held.aktionAusfuehren(aktion, endgegner)
                "3" -> held.aktionAusfuehren(aktion, endgegner)
                "4" -> beutel.benutzeHeiltrank(held)
                "5" -> beutel.benutzeVitamin(held)
                else -> println("Ungültige Aktion!")
            }
        }
        println("Eragon ist am Zug.")
        endgegner.aktionAusfuehren(endgegner.aktionen().random(), heldenTeam)
        println("\u001B[37m" + """Eragon hat noch Lebens Punkte: ${endgegner.hp}""" + "\u001B[0m")

        if (endgegner.hp <= (endgegner.maxHp / 2)) {
            println("Unterboss ist am Zug.")
            val unterboss = Unterboss("Unterboss", 200, 1)
            unterboss.aktionAusfuehren(unterboss.aktionen().random(), heldenTeam)
            println()

        }


        count++
    } while (heldenTeam.isNotEmpty() || gegnaTeam.isNotEmpty())

}