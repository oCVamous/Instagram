import java.util.Scanner;

public class Rekursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = 0;
        int y = 0;
        
        x = einlesen(x, scn);
        y = einlesen(y,scn);

        System.out.println(rekursion(x, y));
        System.out.println("Lösung: "+ x%y);
    }

    public static int einlesen(int x, Scanner scn) {
        System.out.print("Bitte Zahl eingeben ");
        return scn.nextInt();
    }

    public static int rekursion(int x, int y) {
        if( x<y ) {
            return x;
            } else {
            return rekursion( x-y, y );
        }
    }
}
