import java.util.Scanner;
public class aufgabeD {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Bitte Passwort abgeben: ");

    String passwort = scn.next();

    int count = 1;

    while(passwort.length() < 8) {
      System.out.print("Bitte ein längeres Passwort eingeben (mind. 8 Zeichen)");
      passwort = scn.next();
      count++;

    }
    System.out.println("Anzahl der Versuche: " + count);
  }
}