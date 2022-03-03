import java.util.Random;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;

public class Altklausur6b {
    public static void main(String[] args) {
        int sum = 0;
        randomNumber();
        sum = sumOfRandoms();
        System.out.println(sum);
        isRandomSumLarger(sum);

        if (sum > 1500) {
            System.out.println("Summe ist größer als 1500");
        } else {
            System.out.println("Summe ist kleiner als 1500");
        }

        int remain = remainOfRandomSums();
        System.out.println("man braucht " + remain + " Aufrufe");
    }

    public static int randomNumber() {
        Random rand = new Random();
        int zahl = rand.nextInt(30)+1; 
        return zahl; 
    }

    public static int sumOfRandoms() {
        int n = 100;
        int sum = 0;
        
        while (n-- > 0) {
            sum += randomNumber();
        }
        return sum;
    }
    /** 
    public static boolean isRandomSumLarger() {
        return sumOfRandoms() > 1500;
    }
    */
    public static boolean isRandomSumLarger(int sum) {
        return sum > 1500;
      }

      public static int remainOfRandomSums() {
        int remain = 0;
        int sum = 0;
        
        while(sum <= 2000) {
            sum += randomNumber();
            remain++;
        }
        
        return remain;
    }
}
