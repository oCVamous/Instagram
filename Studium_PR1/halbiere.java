import java.util.Scanner;

public class halbiere {
    public static void main(String[] args) {
        int zahl;
        Scanner console = new Scanner(System.in);
       do {
        System.out.println("Eine gerade Zahl bitte: ");
        zahl = console.nextInt();
       } while (zahl % 2 != 0);
       System.out.println(zahl/2);
    }
}

