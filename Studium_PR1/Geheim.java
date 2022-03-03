import java.util.Scanner;
/*Main Methode
*/
public class Geheim {
    public static void main(String[] args) {

        /*Deklarien von allen Nutzernamen und die dazugehörigen Passwörter
        */

        String Benutzername1 = "doors";
        String Benutzername2 = "gates";
        String Benutzername3 = "dent";

        String Geheimwort1 = "lightmyfire";
        String Geheimwort2 = "dos";
        String Geheimwort3 = "42";
        

        /* =============================================================================
        */

        Scanner scn = new Scanner(System.in);
        System.out.print("Benutzername bitte: ");
        String eingabeName = eingabeEinlesen(scn);
        System.out.print("Geheimwort bitte: ");
        String eingabePassword = eingabeEinlesen(scn);

        boolean isUsernameAndPasswordCorrect = eingabeName.equals(Benutzername1) && eingabePassword.equals(Geheimwort1) //Prüfen ob Nutzername + Passwort richtig
            ||eingabeName.equals(Benutzername2) && eingabePassword.equals(Geheimwort2) 
            ||eingabeName.equals(Benutzername3) && eingabePassword.equals(Geheimwort3);

        boolean isUsernameCorrectAndPasswordIncorrect = eingabeName.equals(Benutzername1) && !eingabePassword.equals(Geheimwort1) //Prüfen ob Nutzername richtig und Passwort falsch
            ||eingabeName.equals(Benutzername2) && !eingabePassword.equals(Geheimwort2) 
            ||eingabeName.equals(Benutzername3) && !eingabePassword.equals(Geheimwort3);

        if (isUsernameAndPasswordCorrect) {
            System.out.println("richtig");
        } else if (isUsernameCorrectAndPasswordIncorrect) {
            System.out.println("Benutzername richtig, Geheimwort falsch");
        } else {
            System.out.println("falsch");
        }
    }
    /*Scanner als Parameter!!! + returnen! zum Speichermedium
    */
    public static String eingabeEinlesen(Scanner scn) {
        return scn.next();
    }
}