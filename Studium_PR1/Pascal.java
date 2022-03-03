import java.util.Scanner;
/**
* author: Patrick Sterz
*/
public class Pascal {
    /**
     * Main-Methode
     * 
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Wie viele Zeilen: ");
        int lines = scn.nextInt();
        int[][] dreieck = new int[lines][]; //dreieck-Zeilenarray anlegen
       
        berechnungsSchleife(scn, dreieck);
        ausprintSchleife(dreieck);
    }
    /**
     * Berechnungs-Schleife
     * @param dreieck
     */

    public static int[][] berechnungsSchleife(Scanner scn, int [][] dreieck) {
        
        for (int i=0; i < dreieck.length; i++) {                        
            dreieck[i]= new int[i+1];
            dreieck[i][0]= 1;
            dreieck[i][i]= 1;
            for (int j = 1; j < dreieck[i].length - 1; j++) {
                int value = dreieck[i-1][j-1] + dreieck[i-1][j];
                dreieck[i][j] = value;               
            }
        }
        return dreieck;
    }
    /**
     * Ausprint- Schleife
     * Hier braucht man nur den Parameter: dreieck[][] übergeben, da nur diese ausgeprinted wird.
     * @param dreieck
     */
    public static void ausprintSchleife(int dreieck[][]) {
        for (int i = 0; i < dreieck.length; i++) {                      
            for (int j = 0; j < dreieck[i].length; j++) {

                System.out.print(dreieck[i][j]);                
            }
            System.out.println();
        }
    }
}

