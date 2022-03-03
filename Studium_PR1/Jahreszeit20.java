import java.util.Scanner;

/**
 * author: Patrick Sterz
 */
public class Jahreszeit20 {
    /**
     * Main Methode Wichtig: 1. Do-while für mindestens 1x Abfrage + Innerhalb der
     * do-while ein prombt einbauen 2. If innerhalb der der DO!
     */
    public static void main(String[] args) {
        int monat = 0;
        int tag = 0;
        Scanner input = new Scanner(System.in);
        do {
            tag = ganzZahlLesen(input, "Tag (1-31): ", 31);
            monat = ganzZahlLesen(input, "Monat (1-12): ", 12);
            if (!istGueltig(tag, monat)) {
                System.out.println("Datum ist ungültig. Wiederholen.");
            }
        } while (!istGueltig(tag, monat));

        if (monat == 12 && tag >= 21 || monat == 3 && tag <= 19 || monat == 1 || monat == 2) {
            System.out.println("Winter");
        } else if (monat == 3 && tag >= 20 || monat == 6 && tag <= 20 || monat == 4 || monat == 5) {
            System.out.println("Frühling");
        } else if (monat == 6 && tag >= 21 || monat == 9 && tag <= 21 || monat == 7 || monat == 8) {
            System.out.println("Sommer");
        } else {
            System.out.println("Herbst");
        }
    }

    public static int ganzZahlLesen(Scanner input, String prompt, int max) {
        System.out.print(prompt);
        while (true) {
            if (input.hasNextInt()) { // Zum Blocken
                return input.nextInt();
            }
            input.next();
            System.out.println("Bitte eine ganze Zahl eingeben.");
        }

    }

    public static boolean ganzzahlInBereichLesen(Scanner input, String prompt, int max) {
        String outOfScope = "Nicht im geforderten Bereich.";
        int userInput;
        do {
            userInput = ganzZahlLesen(input, prompt, max); // Hier soll er solange die Zahl einlesen, bis er eine zahl
                                                           // bekommt
            // Status = Ob nicht im Bereich
            boolean isOutOfScope = !(1 <= userInput && userInput <= max);

            if (isOutOfScope) {
                System.out.println(outOfScope);
            }

            // Solange wiederholen, bis im Bereich
        } while (!(1 <= userInput && userInput <= max));

        // Schleife durch = Eingabe im Rahmen
        return true;

    }

    public static boolean istGueltig(int tag, int monat) {
        if (tag <= 0 || monat <= 0 || monat > 12 || tag > 31) {
            return false;
        }
        if (monat < 8) { // Wenn der Monat unter August liegt
            if (monat == 2) { // => Wenn Monat der Februar ist
                return (tag <= 29); // -> 28 Tage
            } else if (monat % 2 == 0) { // => Wenn der Monat gerade ist
                return (tag <= 30); // -> 30 Tage
            } else { // => Wenn der Monate ungerade ist
                return (tag <= 31); // -> 31 Tage
            }
        } else { // Wenn der Monat über oder gleich August liegt
            if (monat % 2 == 0) { // => Wenn der Monat gerade ist
                return (tag <= 31); // -> 31 Tage
            } else { // => Wenn der Monate ungerade ist
                return (tag <= 30); // -> 30 Tage
            }
        }
    }
}
