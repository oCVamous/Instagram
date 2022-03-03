import java.util.Scanner;

public class Hourglass {

    public static final int SUB__HEIGHT = 4; 
    public static void main(String[] args) {
        line();
        top_half();
        bottom_half();
        line();

    }

    private static void bottom_half() {
        int i;
        for (int line = 1; line <= SUB__HEIGHT; line++) {
            System.out.print("|");
            for (i = 1; i <= (SUB__HEIGHT-line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
             for (i =1; i <= 2* (line-1); i++) {
                 System.out.print(".");
             }

            System.out.print("\\");
            for (i = 1; i <= (SUB__HEIGHT-line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    private static void top_half() {
        int i;
        for (int line = 1; line <= SUB__HEIGHT; line++) {
            System.out.print("|");
            for (i = 1; i <= (line-1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
             for (i =1; i <= (2*SUB__HEIGHT-2*line); i++) {
                 System.out.print(".");
             }

            System.out.print("/");
            for (i = 1; i <= (line-1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    private static void line() {
        System.out.print("+");
        for (int i = 1; i <= (2*SUB__HEIGHT); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
