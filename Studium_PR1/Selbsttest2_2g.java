public class Selbsttest2_2g {
    public static void main(String[] args) {
        int zahl = 8546587;
        int count = countEvenDigits(zahl);

        System.out.println(count);
    }

    public static int countEvenDigits(int zahl) {
        int count = 0;
        while (zahl != 0) {
            int letzteZiffer = zahl % 10;
            zahl = zahl/10;

            if (letzteZiffer % 2 == 0) {
                count++;
            }
        } 
        return count;
    }
}
