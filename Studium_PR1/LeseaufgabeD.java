/**
 * Verwenden Sie die Methoden String.valueOf, String.split, String.length sowie 
 * den StringBuilder, um folgende Aufgabe zu lösen: 
 * Umwandlung einer double-Zahl in eine Zeichenkette mit insgesamt genau 7 Zeichen, 
 * davon 4 Stellen vor dem Dezimalpunkt (ggf. führende Leerzeichen einfügen) 
 * und 2 Stellen nach dem Dezimalpunkt. Evtl. überzählige Nachkommastellen sollen ohne 
 * Rundung abgeschnitten werden. Gehen Sie von einer positiven double-Zahl 
 * in folgendem Intervall aus: [0.001, 9999.999]. Für diese Zahlen liefert Ihnen 
 * String.valueOf eine "normale" Darstellung der Zahl (keine wissenschaftliche Notation).
 */


public class LeseaufgabeD {
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
        // Ganz- und den Dezimalpart bei '.' abtrennen
        String[] parts = String.valueOf(x).split("\\.");
        String integerPart = parts[0];
        String decimalPart = parts[1];
        // Stringbuilder zum Bauen des Strings instanziieren                
        StringBuilder sb = new StringBuilder();
        // Wie viele mögliche Nullen es im Ganzpart geben kann
        int zeros = 4 - integerPart.length();
        // fehlende Nullen im StringBuilder hinzufügen
        for (int i = 0; i < zeros; i++) {
            sb.append("0");
        }
        // Den Ganzpart samt '.' anfügen
        sb.append(integerPart + ".");
        /* --- */
        // Wie viele mögliche Nullen es im Dezimalpart geben kann
        zeros = 2 - decimalPart.length();
        // Wenn zu hinzufügende Nullen benötigt werden
        if (zeros > 0) {
            // Erst den Dezimalpart anfügen
            sb.append(decimalPart);
    
            // fehlende Nullen nach dem angefügten Dezimalpart anfügen
            for (int i = 0; i < zeros; i++) {
                sb.append("0");
            }
        // Wenn keine Nullen gefunden worden sind
        } else {
             // Dezimalpart mit möglicher Abtrennung (ohne Rundung)
            sb.append(decimalPart.substring(0, 2));
        }
        return sb.toString();
    }

}

