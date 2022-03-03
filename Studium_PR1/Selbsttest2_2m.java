import java.util.HashSet;
import java.util.Random;

public class Selbsttest2_2m {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        randomInSet(set);
    }

    public static Integer randomInSet(HashSet<Integer> set) {
        Random rand = new Random();
        int n = rand.nextInt(set.size());
        int i = 0;
        for (int obj : set) {
            if(i == n) {
                return obj;
            }
            i++;
        }
        return null;
    }
}
