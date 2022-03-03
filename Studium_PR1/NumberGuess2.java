import java.util.Random;
import java.util.Scanner;

public class NumberGuess2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int zufallszahl = 42; //rand.nextInt(100);
        int vermutung = 0;
        int versuche = 0;

        Scanner console = new Scanner(System.in);
        boolean isCorrect = false;

        
        do {
            //Einlesen
            vermutung = eingabeFordern(console, vermutung);
        
            //Korrektheit prüfen
            isCorrect = (zufallszahl == vermutung);

            //Tipps
            if(!isCorrect) {
                int treffer = anzahlTreffer(zufallszahl, vermutung);
                System.out.println("Falsch! " + treffer + " Treffer");
            }
                versuche++;
        }  while (!isCorrect);
        System.out.println("Richtig. Versuche: " + versuche);
    }
    

    public static int nochmal(String prombt, Scanner console) {
        System.out.println(prombt);
        while (!console.hasNextInt()) {
            System.out.println("Das war keine ganze Zahl, Nochmal bitte");
            console.next();
            System.out.println(prombt);
        }
        return console.nextInt();
    }

    public static int eingabeFordern(Scanner console, int vermutung) {
        do {
            vermutung = nochmal("Ihre Vermutung (0-99)? ", console);
        } while(vermutung < 0 || vermutung > 99);
        return vermutung;
        
    }

    public static int anzahlTreffer(int zufallszahl, int vermutung) {
        int treffer = 0;
        
        int ersteZifferZufallszahl = zufallszahl/10;
        int zweiteZifferZufallszahl = zufallszahl % 10;
        int ersteZifferVermutung= vermutung/10;
        int zweiteZifferVermutung = vermutung % 10; 

        if(ersteZifferZufallszahl == ersteZifferVermutung || ersteZifferZufallszahl == zweiteZifferVermutung) {
            treffer++;
        }
        if (ersteZifferVermutung != zweiteZifferVermutung
        && (zweiteZifferVermutung == ersteZifferZufallszahl || zweiteZifferVermutung == ersteZifferZufallszahl)) {
                    treffer++;
        }
        return treffer;
    }
}