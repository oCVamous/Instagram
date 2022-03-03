public class Test30 {
    /**
 * Verwenden Sie die Methoden String.valueOf, String.split, String.length sowie den StringBuilder, um folgende Aufgabe zu lösen: 
 * Umwandlung einer double-Zahl in eine Zeichenkette mit insgesamt genau 7 Zeichen, davon 4 Stellen vor dem Dezimalpunkt (ggf. führende Leerzeichen einfügen) 
 * und 2 Stellen nach dem Dezimalpunkt. Evtl. überzählige Nachkommastellen sollen ohne Rundung abgeschnitten werden. Gehen Sie von einer positiven double-Zahl 
 * in folgendem Intervall aus: [0.001, 9999.999]. Für diese Zahlen liefert Ihnen String.valueOf eine "normale" Darstellung der Zahl (keine wissenschaftliche Notation).
 */

 public static void main(String[] args) {
    for (String arg : args) {
        System.out.println(arg + " => " + doubleToString(Double.valueOf(arg)));
    }  
     
}

public static String doubleToString(double x) {
    // Prüfen, ob im Intervall
    if (x < 0.001 || x > 9999.999) {
        return "ERROR";
    }

    String parts [] = String.valueOf(x).split("\\.");
    String part1 = parts[0];
    String part2 = parts [1];


    StringBuilder sb = new StringBuilder();

    int zeros = 4-part1.length();

    for (int i = 0; i < zeros; i++) {
        sb.append("0");
    }

    sb.append(part1 + ".");

    zeros = 2-part2.length();

    for (int i = 0; i < zeros; i++) {
        sb.append("0");
    }

    sb.append(".");
    
}
