import java.util.Scanner;
/** 
Rufe die Methode einlesen() auf + Scanner als Parameter übergeben + variablen namen ("a/"b"c)
*/
public class Winkel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Dieses Programm errechnet die drei Winkel eines Dreiecks.");
        double zahlA = einlesen(scn, "a");
        double zahlB = einlesen(scn, "b");
        double zahlG = einlesen(scn, "c");
        double alpha = kosinussatz(zahlG, zahlB, zahlA);
        System.out.println("alpha = " + alpha);
        double beta = kosinussatz(zahlA, zahlG, zahlB); 
        System.out.println("beta = " + beta);
        double gamma = kosinussatz(zahlB, zahlA, zahlG);
        System.out.println("gamma = " + gamma);
    }

/**
Hier wichtig: einen ersetzbaren String schreiben
 */
    public static double einlesen(Scanner scn, String name ) {
        System.out.print("Bitte Seitenlänge "+ name + " eingeben: ");
            double zahl  = scn.nextDouble();
            return zahl;
    }
/**
Um die Formel nur einmal zu schreiben, muss ich zahlA/N/G durch zahlD/E/F ersetzen. 
Wie die reihenfolge ist  bestimme ich dadurch, 
dass ich die Parameter übergebe. Parameter=Reihenfolge
 */
    public static double kosinussatz(double zahlD,double zahlE, double zahlF) {
        double kosinus =(zahlD*zahlD+zahlE*zahlE-zahlF*zahlF)/(2*zahlD*zahlE);
        double winkel = Math.acos(kosinus);
        double grad = round1(Math.toDegrees(winkel));
        return grad;
    }
/**
gegebene Formel
 */
    public static double round1(double value) {
    if (Double.isNaN(value)) return value;
    if (Double.isInfinite(value)) return value;
    return Math.round(value * 10) / 10.0;
    }    
}