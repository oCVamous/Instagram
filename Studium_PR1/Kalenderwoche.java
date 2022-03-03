import java.util.Scanner;

public class Kalenderwoche {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int kw = lies(console);
        while (kw<1 || kw> 52) {
            System.out.println("Keine gültige KW");
            kw = lies(console);
        }
        int person = kw%5 +1;
        System.out.println("Person P"+person);
    }

    public static int lies(Scanner console) {
        System.out.println("KW? ");
        return console.nextInt();
    }
}
