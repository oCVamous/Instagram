import java.util.Random;
public class Wahrscheinlichkeit {
    public static void main(String[] args) {
        Random random = new Random();
        int start=1;

        for (int i = 0; i < 10; i++) {
            System.out.println(start);
            int n = random.nextInt(10);
            if(n>=0 && n<=5) {
                start++;
            } else if (n>6 && n<=8) {
                start--;
            } else if (n==8) {

            }
        }
            System.out.println(start);
    }
}
