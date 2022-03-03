import java.util.Scanner;

public class Test3 {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in); // Deklaration des Scanners
    System.out.println("Bitte Höhe des Pascalschen Dreiecks eingeben:");

    int Höhe = sc.nextInt(); // Die Varriable Höhe wird eingelesen
    int[][] matrix = new int[Höhe][(2 * Höhe) + 1]; // Erstellen eines Arrays "matrix"; zuerst die Anzahl der Zeilen =
                                                    // Höhe und danach die Anzahl der Spalten = 2*Höhe+1
    matrix = Werte(matrix, Höhe); // neuer Methodenaufruf in Verbindung mit der neuen Methode "Werte" außerhalb
                                  // der Methode "main"

    for (int i = 0; i < matrix.length; i++) { // Wir brauchen 2 for-Schleifen um in das zweidimensionale Array
                                              // zuzugreifen
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] == 0) { // if-Schleife: Überprüfung der Werte gleich 0, "==" testet zwei Variablen auf
                                 // Gleichheit

          System.out.print("  "); // Ausgabe von zwei Leerzeichen für den Wert 0
        } else {
          System.out.print(matrix[i][j] + " "); // Ausgabe der Werte + ein weiteres Leerzeichen
        }
      }
      System.out.println("\n"); // Die Ausgabe "\n" bewirt den Zeilenumbruch der nächsten Werte auf die nächste
                                // Zeile
    }
  }

  public static int[][] Werte(int[][] matrix, int Höhe) { // Erstellen einer neuen Methode "Werte"

    matrix[0][Höhe] = 1; // In "Zeile 1" (0) kann nur der Wert 1 ausgegeben werden, es bildet die Spitze
                         // des Pascalschen Dreiecks
    for (int i = 1; i < matrix.length; i++) { // for-Schleife: Initialisierung des Zählers (ab welchem Wert wird
                                              // gezählt)--> hier erst ab 1, da 0 schon definiert
      for (int j = 1; j < 2 * Höhe; j++) {

        matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j + 1]; // Berechnung der unteren Werte --> Addition des
                                                                    // Wertes eine Reihe höher und eine Spalte weiter
                                                                    // links mit dem Wert eine Reihe höher aber eine
                                                                    // Spalte weiter rechts
      }
    }
    return matrix; // greift auf die Inhalte(Werte) des Array's "matrix" zurück und gibt diese
                   // durch die Standardausgabe aus
  }
}