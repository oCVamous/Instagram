import java.util.Scanner;

public class Geheim2{
    public static void main(String[] args) {
        String Geheimwort1 = "lightmyfire";
        String Geheimwort2 = "dos";
        String Geheimwort3 = "42";
        
        String Benutzername1 = "doors";
        String Benutzername2 = "gates";
        String Benutzername3 = "dent";
        boolean isCorrectBenutzername = vermutungBenutzername.equals(Benutzername1) && vermutungGeheimwort.equals(Geheimwort1) ||
                vermutungBenutzername.equals(Benutzername2) && vermutungGeheimwort.equals(Geheimwort2) ||
                vermutungBenutzername.equals(Benutzername3) && vermutungGeheimwort.equals(Geheimwort3);
        String vermutungBenutzername;
        String vermutungGeheimwort;
        int treffer = 0;
        Scanner scn = new Scanner(System.in);
        //Einlesen -->
        String vermutungBenutzername = einlesen1(scn, vermutungBenutzername);
        String vermutungGeheimwort = einlesen2(scn, vermutungGeheimwort);

        //Korrektheit prüfen --->Keywörter richtig
        if (isCorrect) {
        // Daten haben zusammen gepasst, war alles richtig
            System.out.println("Erfolgreicher Login");
        } else if (vermutungBenutzername.equals(Benutzername1) && !vermutungGeheimwort.equals(Geheimwort2) || 
                   vermutungBenutzername.equals(Benutzername2) && !vermutungGeheimwort.equals(Geheimwort2) ||
                   vermutungBenutzername.equals(Benutzername3) && !vermutungGeheimwort.equals(Geheimwort2) ) {
                       System.out.println("BEnutzername richtig, Falsches Passwort");
        // Wenn Name richtig ist, aber passwort falsch  
        } else { 
            system.out.println("Falsches Geheimwort");
        // Wenn Name falsch
        }   
    }
    public static String einlesen1(Scanner scn, String vermutungBenutzername) {
        System.out.println("Benutzername eingebn: ");
        String vermutungBenutzername = scn.next();
        return vermutungBenutzername;
    }
    public static String einlesen2(Scanner scn, String VermutungGeheimwort) {
        System.out.println("Geheimwort eingebn: ");
        String vermutungBenutzername = scn.next();
        return vermutungGeheimwort;
    }
}