import java.util.Scanner;

public class vierQuadrate2 {
    public static void main(String[] args) {
        System.out.println("Wie groß: ");
        Scanner scn = new Scanner(System.in);
        int Größe = scn.nextInt();
        kopf(Größe);
        körper(Größe);
        kopf(Größe);
        körper(Größe);
        kopf(Größe);
    }

    private static void körper(int größe) {
        for (int  j = 0; j < größe; j++) {                    
            System.out.print("#");
            for (int  i = 0; i < größe; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int  i = 0; i < größe; i++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
    

    private static void kopf(int größe) {
        for (int i = 0; i <= größe; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int i = 0; i <= größe; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
