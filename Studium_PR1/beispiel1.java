import java.util.Random;

public class beispiel1 {
    public static void main(String[] args) {
        randomNumber();
    }

    private static void randomNumber() {
        Random rand = new Random();
        int r = 10 + rand.nextInt(20) +1;
        System.out.println(rand);
    }
}
