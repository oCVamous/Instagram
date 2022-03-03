import java.util.Scanner;
/**
 * überprüft das eingegebene datum auf die Jahreszeitg
 * 
 *
 */
public class Jahreszeit {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
      
        boolean isRealDate = false;
        int day = 0;
        int month = 0;
        do {
            day = getNumberFromUser(console, 1, 31, "Tag");
            month = getNumberFromUser(console, 1, 12, "Monat");

            isRealDate = isRealDayInMonth(day, month);
            if ( !isRealDate ) {
                System.out.println("Datum ist ungültig. Wiederholen.");
            }            
        } while ( !isRealDate );

        System.out.println(getSeason(day, month));
        
        console.close();
    }
    
    
    /**
     * holt eine eingabe von nutzer von ganzen zahlen in der range von min & max
     * @param scn
     * @param min
     * @param max
     * @param name
     * @return
     */
    public static int getNumberFromUser(Scanner scn, int min, int max, String name) {
        int out = 0;
        while (out <= 0) {
            System.out.print(name + " (" + min + "-" + max + "): ");
            
            if ( !scn.hasNextInt() ) {

                scn.next();
                System.out.println("Bitte eine ganze Zahl eingeben.");
            } else {
                
                // wenn ja dann überprüfe das
                int nextint = scn.nextInt();
                if (nextint >= min && nextint  <= max) {
                    out = nextint;
                } else {
                    System.out.println("Nicht im geforderten Bereich.");
                }
            }
        }        
        return out;
    }
    
    /**
     * ist das den überhaupt ein wirkliches datum?
     * @param day
     * @param month
     * @return boolean
     */
    public static Boolean isRealDayInMonth(int day, int month) {
        if (month == 8 && day == 31) {
            return true;
        } else if (month == 2 && day > 29) {
            return false;
        } else if (month % 2 == 0 && day > 30) {
            return false;
        }
        
        return true;
    }
    /**
     * gibt den String für die Jahreszeit zurück
     * @param day
     * @param month
     * @return Jahreszeit
     */
    public static String getSeason(int day, int month) {
        int monthday = month * 100 + day;
        
        if (monthday >= 1221) {
            return "Winter";
        }
        if (monthday >= 922) {
            return "Herbst";
        }
        if (monthday >= 621) {
            return "Sommer";
        }
        if (monthday >= 320) {
            return "Frühling";
        }
        
        return "Winter";
    }
}