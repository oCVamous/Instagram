import java.util.Random;

public class ZufallsZahlenfolge {
    
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);

        for (int i = 0; i < 100; i++) {
            int augenZahl = 1+ rand.nextInt(6);
            System.out.println(augenZahl);
        }
    }
}

