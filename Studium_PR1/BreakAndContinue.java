import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int zahl = 0;
        boolean weitermachen = true;

    while(weitermachen) {
        System.out.print("Bitte gib eine Zahl ein: ");
        zahl = input.nextInt();
        weitermachen = zahl != -1;
        if(!weitermachen) {
            break;                  //Sprung zum 1ten Statement HINTER der Schleifes
        }
        if (zahl % 5 != 0) {
            continue;               //Sprung zum Anfang der Schleife, somit wird Bedingung neu geprüft
        }
        sum = sum + zahl;
    }
    System.out.println(sum);
}
}
//do-while   