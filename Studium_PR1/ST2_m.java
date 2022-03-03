import java.util.HashSet;
import java.util.Random;

public class ST2_m {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        randomInSet(set);
    }

    public static void randomInSet(HashSet<Integer> set) {
        Random rand = new Random();
        int n = rand.nextInt(set.size());
    }
}
