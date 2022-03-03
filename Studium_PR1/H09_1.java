import java.util.*; 
public class H09_1{
    public static void main(String[] args) {
        System.out.println(einlesen(new Scanner(System.in)));
    }

    public static int einlesen(Scanner console) {
        int zahl = 0;
        do {
            try {
            System.out.print("Bitte geben sie eine ganze Zahl ein (>0): ");
            zahl = console.nextInt();
            if(zahl<=0) {
                System.err.println("Die Zahl ist nicht > 0.Nochmal: ");
            }
            } catch (InputMismatchException ex) {
                System.err.println("Das ist keine ganze Zahl. Nochmal: ");
                console.nextLine();
            }
        }while (zahl <= 0);
        return zahl;
    }
}
