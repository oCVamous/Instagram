import java.util.Scanner;

public class Monate {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.print("Bitte Zahl eingeben: ");
        int i= scanner.nextInt();

            switch(i) {
            case 1, 3, 5, 7, 9, 11:
                System.out.println("31 Tage");
                break;
            case 4, 6, 8, 10, 12:
                System.out.println("30 Tage");
                break;
            case 2:
                System.out.println("28 Tage");
                break;
            default:
                System.out.println("Kein valides Monat eingegeben");
        }
    }
}



