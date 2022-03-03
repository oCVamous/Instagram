import java.util.Scanner;

public class Selbsttest2_2h {

    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        System.out.print("Dreiecks Größe: ");
        int n = scn.nextInt();
        printFigure(n);
    }

    public static void printChars(int n, char c) {
        for (int j = 0; j < n; j++) {
            System.out.print(c);

        }
    }

    public static void printFigure(int n) {
        printChars(n - 1, ' ');
        System.out.println("|");
        for (int i = 1; i < n; i++) {
            printChars(n - i - 1, ' ');
            System.out.print("/");
            printChars(i - 1, ' ');
            System.out.print("|");
            printChars(i - 1, ' ');
            System.out.print("\\");
            System.out.println();
        }
        printChars(n * 2 - 1, '-');
        System.out.println();
    }
    /**
     * public static void main(String[] args) {
     * var scn = new Scanner(System.in);
     * System.out.print("Dreiecks Größe: ");
     * int n = scn.nextInt();
     * figurzeichnen(n);
     * }
     * 
     * public static void figurzeichnen(int n) {
     * seiten(n);
     * boden(n);
     * }
     * 
     * public static void boden(int n) {
     * for(int i= 1; i< n*2; i++) {
     * System.out.print("_ ");
     * }
     * }
     * 
     * public static void seiten(int n) {
     * printLeerzeichen(n-1, ' ');
     * System.out.print("|");
     * 
     * }
     * 
     * public static void printLeerzeichen(int n, char c) {
     * for (int i = 0; i< n; i++ )
     * System.out.println(c);
     * }
     */
}
