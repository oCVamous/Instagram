public class Klausur4 {
    public static void main(String[] args) {
        int width = 12;
        for (int i = 0; i < width / 3; i++) {
            for (int j = 0; j < (10-(i*3)); j++) {
                System.out.print("+");
            }
            System.out.print("/");

            for (int j = 0; j < (i * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


