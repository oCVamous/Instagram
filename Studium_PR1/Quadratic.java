import java.util.Scanner;
   /**
     * Main Methode, 
     WICHTIG: Damit keine krumme Zahl rauskommt muss 
     eine globale nicht veränderbare Ausgleichszahl definiert werden
     */
public class Quadratic {
    public static final double EPSILON = 0.001;
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Dein a bitte: ");
        double a = userInput.nextDouble(); //hier wird in a gelesen und gespeichert
        userInput.nextLine();

        System.out.print("Dein b bitte: ");
        double b = userInput.nextDouble(); //hier wird in b gelesen und gespeichert
        userInput.nextLine();

        System.out.print("Dein c bitte: ");
        double c = userInput.nextDouble(); //hier wird in c gelesen und gespeichert
        userInput.nextLine();

        quadratic(a, b, c);
    }
    /**
     * Diese Methode ergibt die Lösung einer quadratischen Gleichung. Vorausgesetzt a ist nicht 0.
     */
    public static void quadratic(double a, double b, double c) {
        if (a == 0) {
            System.out.println("a muss ungleich 0 sein");
            return;
        }
        double delta = b*b - 4*a*c;
        if (Math.abs(delta) < EPSILON) {
            double x = -b/(2*a);
            System.out.println("Lösung: " + round1(x));

        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (-b - Math.sqrt(delta)) / 2*a;
            System.out.println("Erste Lösung = " + round1(x1));
            System.out.println("Zweite Lösung = " + round1(x2));

        } else {
            System.out.println("Keine reelle Lösung");
        }
    }
    /**
        Abrundungsmethode
     */
    public static double round1(double value) {
        if (Double.isNaN(value)) return value;
        if (Double.isInfinite(value)) return value;
        return Math.round(value * 10) / 10.0;
    }
}