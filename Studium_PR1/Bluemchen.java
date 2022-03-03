import java.util.Scanner;

public class Bluemchen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nenne eine zahl: ");
        int n = scn.nextInt();
        bluemchen(n);
       
    }
    public static void bluemchen(int n) {
      
        if (n%2 == 0) {
            System.out.println("Er/Sie liebt mich");
          } else {
            System.out.println("Er/Sie liebt mich nicht");
          }
          if (n == 0) return;
          bluemchen(n-1);
          return;
    }
}

