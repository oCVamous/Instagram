import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int tag = 0;
        int monat = 0;


        do {
            tag = einlesen(input, "Tag: ", 31);
            monat = einlesen(input, "Monat: ", 12);
            if(!isDayInMonth(tag, monat)) {
                System.out.println("Datum ungültig. Wiederholen");
            }
        } while (!isDayInMonth(tag, monat));
        

        if (monat == 12 && tag >= 21 || monat == 3 && tag <= 19 || monat == 1 || monat == 2) {
            System.out.println("Winter");
        } else if (monat == 3 && tag >= 20 || monat == 6 && tag <= 20 || monat == 4 || monat == 5) {
            System.out.println("Frühling");
        } else if (monat == 6 && tag >= 21 || monat == 9 && tag <= 21 || monat == 7 || monat == 8) {
            System.out.println("Sommer");
        } else {
            System.out.println("Herbst");
        }
    }

    public static boolean isDayInMonth(int tag, int monat) {
        if (monat > 12 || tag > 31) {
            return false;
        }

        if (monat == 8 && tag == 31) {
            return true;
        } else if (monat == 2 && tag > 29) {
            return false;
        } else if (monat % 2 == 0 && tag > 30) {
            return false;
        }
        return true;  
    }

    public static int einlesen(Scanner input, String prompt, int max) {
        System.out.print(prompt);
        while(true) {
            if (input.hasNextInt()) {
                return input.nextInt();
            }
            input.next();
            System.out.print("Bitte ganze Zahl eingeben: ");
        }
    }

}
