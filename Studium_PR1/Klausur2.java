public class Klausur2 {
    public static void main(String[] args) {
        int width = 12;

        // Height(Anzahl Zeilen): width / 2
        for (int i = 0; i < width / 2; i++) {
    
            // 0 bis i Mal das Dollar-Zeichen
            for (int j = 0; j < i; j++) {
                System.out.print("$");
            }
            // Immer die Raute mit!
            System.out.print("#");

            /*
                Jeweils 2 von width abgezogen
                Weil i nur bis 6 geht, und wir die exakte width brauchen, multiplizieren wir
                  i mit 2.
                Daher: width - (i * 2) - 2
            */
            for (int j = 0; j < width - (i * 2) - 2; j++) {
                System.out.print("+");
            }

            // Ab zur neuen Zeile und wiederholen
            System.out.println();    
        }

    }
}
