/**
 * Klassenname = Dateiname
 *
 */
public class Kant {
    /**
     * Main Methode
     */
    public static void main(String[] args) {
        zeile1000mal();
    }
    /**
     *  gibt die zeile 1 mal aus
     */
    public static void zeile1Mal() {
        System.out.println("Habe Mut dich deines eigenen Verstandes zu bedienen!");
    }
    /**
     *  gibt die zeile 10 mal aus
     */
    public static void zeile10mal() {
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
        zeile1Mal();
    }
    /**
     * gibt die zeile 100 mal aus
     */
    public static void zeile100mal() {
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
        zeile10mal();
    }
    /**
     *  gibt die zeile 1000 mal aus
     */
    public static void zeile1000mal() {
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
        zeile100mal();
    }

}