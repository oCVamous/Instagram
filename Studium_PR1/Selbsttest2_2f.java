import java.util.Scanner;

public class Selbsttest2_2f {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        int n = scn.nextInt();
        harmonic(n);
        System.out.println(n);
    }

    public static double harmonic(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("harmonic: n < 0");
        } else if (n == 0) {
            return 0.0;
        } else {
           return harmonic(n-1) + 1.0/n;
        }
       
    }
}
