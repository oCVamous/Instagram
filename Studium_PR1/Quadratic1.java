import java.util.Scanner;

public class Quadratic1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Dein a bitte: ");
        double a = userInput.nextDouble(); //hier wird in a gelesen und gespeichert
        userInput.nextLine();

        System.out.print("Dein b bitte: ");
        double b = userInput.nextDouble(); //hier wird in a gelesen und gespeichert
        userInput.nextLine();

        System.out.print("Dein c bitte: ");
        double c = userInput.nextDouble(); //hier wird in a gelesen und gespeichert
        userInput.nextLine();

        double[] loesungsmenge = quadratic(a, b, c);
        printQuadratic(loesungsmenge);
    }
    
        public static void printQuadratic(double[] result) {
        if (result.length == 1) {
            System.out.println("x1 = " + round1(result[0]));
        } else if (result.length == 2) {
            System.out.println("Erste Lösung " + round1(result[0]));
            System.out.println("Zweite Lösung " + round1(result[1]));
        } else {
            System.out.println("Keine Lösung (a war 0)");
        }
    }

    public static double[] quadratic(double a, double b, double c) {
        if (a == 0) {
            return new double[] {};
        }

        double pow = b * b - 4 * a * c;

        if (pow == 0) {
            return new double[] { -b / (2 * a) };
        }
        if (pow < 0) { // keine reelle Zahl wenn b² - 4ab kleiner als 0
            return null;
        }

        double sqrtD = Math.sqrt(pow);
        return new double[] { (-b - sqrtD) / (2 * a), (-b + sqrtD) / (2 * a) };
    }

    public static double round1(double value) {
    if (Double.isNaN(value)) return value;
    if (Double.isInfinite(value)) return value;
    return Math.round(value * 10) / 10.0;
    }
}
//console.log(Math.pow(7, 3));
// expected output: 343