// Schreiben Sie ein Programm, dass eine Geheimzahl von 0-99 generiert und bitten Sie den User per Eingabe diese zahl zu erraten,
// Dabei soll das Programm den User Tipps geben. Bsp.: Die Geheinzahl lautet 42 und der User errät die Zahl 14. 
// Dann soll die Console ausgeben, dass zumindest eine Ziffer richtig ist.
// Außerdem sollen ungültige Eingaben (bsp: 200), den User zur erneuten Eingabe bitten.
// Und bauen Sie einen Versuchszähler ein.
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int zufallszahl = 42; //rand.nextInt(100);
        int vermutung = 0;
        int versuche = 0;

        Scanner console = new Scanner(System.in);
        boolean isCorrect = false;
        
        // Vesuche Wdh
        do {
            // Einlesen
            vermutung = vermutungEinlesen(console, vermutung);

            // Prüfen
            isCorrect = (vermutung == zufallszahl);

            // Tipps
            if (!isCorrect) {
                int treffer = anzahlTreffer(zufallszahl, vermutung);
                System.out.println("Falsch! " + treffer + " Treffer");
            }

            versuche++;
        } while (!isCorrect);

        System.out.println("Richtig. Versuche: " + versuche);
    }

    public static int vermutungEinlesen(Scanner console, int vermutung) {

        // solange vesuchen bis valide Eingabe
        do {
            vermutung = zahlEinlesen("Ihre Vermutung (0-99)? ", console);
        } while (vermutung < 0 || vermutung > 99);

        return vermutung;
    }

    public static int zahlEinlesen(String prombt, Scanner console) {
        System.out.print(prombt);

        // solange Eingabe fordern bis Zahl eingegeben wurde
        while (!console.hasNextInt()) {
            System.out.println("Das war keine ganze Zahl, Nochmal bitte");
            System.out.println(prombt);
            console.next();
        }

        // wenn eingegeben dann Rückgabe von int
        return console.nextInt();
    }

    public static int anzahlTreffer(int zufallszahl, int vermutung) {
        int treffer = 0;

        int ersteZifferZufallszahl = zufallszahl/10;
        int zweiteZifferZufallszahl = zufallszahl % 10;
        int ersteZifferVermutung= vermutung/10;
        int zweiteZifferVermutung = vermutung % 10;

        if (ersteZifferVermutung == ersteZifferZufallszahl
                || ersteZifferVermutung == zweiteZifferZufallszahl) {
                treffer++;
            }
        
        if (ersteZifferVermutung != zweiteZifferVermutung
            && (zweiteZifferVermutung == ersteZifferZufallszahl
                || zweiteZifferVermutung == ersteZifferZufallszahl)) {
                    treffer++;
                }
            return treffer;
    }
}