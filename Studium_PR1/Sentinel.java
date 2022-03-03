/*
author: Patrick Sterz
*/
import java.util.Scanner;
public class Sentinel {
/*
Main Methode
Wichtig:    1. Scanner einbauen
            2. String "aktuelleEIngabe" VOR DER Do-while Schleife deklarieren SOWIE String "namensListe"
*/
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String aktuelleEingabe = null;
        String namensListe = "";

        do {
            System.out.print("Geben Sie einen Namen ein (oder eine leere Zeile zum Beenden): ");

            aktuelleEingabe = scn.nextLine();
            namensListe = namensListe + aktuelleEingabe +", ";
            
            if (aktuelleEingabe.isEmpty()) {
                System.out.println("Willkommen an alle :" + namensListe.substring(0, namensListe.length() - 4));
                break;
            }
        }
        while (true);
    }
}