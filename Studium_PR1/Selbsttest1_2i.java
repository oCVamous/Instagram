import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Selbsttest1_2i {
    public static final int NUM = 1000;
    public static void main(String[] args) {
        var rand = new Random();

        int count = 0;

        for (int i = 0; i <= NUM; i++) {
            int z = rand.nextInt(10)+1;

            if (z > 5) {
                count++;
            }
        }
        System.out.println("So oft > als 5: " + count);
        System.out.println("So oft <= als 5: " + (NUM-count));
    }
}
