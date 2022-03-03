import java.util.Scanner;

public class FigurZeichnen2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Wie groß soll die Figur sein: ");
        int n = scn.nextInt();
        int mitte = (n - 1) / 2;
        int steg;
        if (n % 2 == 0) {
            steg = 2;
        } else {
            steg = 1;
        }
        zeichnen(mitte, steg);
    }

    private static void zeichnen(int mitte, int steg) {
        //obere Hälfte
        for (int z = 0; z < mitte; z++) {
            zeichneZeile(mitte, steg, z);
        }


        //Mitte zeichnen
        for (int i = 0; i < steg; i++) {
            zeichneZeichen('-', mitte);
            zeichneZeichen('+', steg);
            zeichneZeichen('-', mitte);
            System.out.println();
        }

        //Untere Hälfte zeichnen
        for (int z = mitte - 1; z >= 0; z--) {
            zeichneZeile(mitte, steg, z);
        }
    }

    private static void zeichneZeichen(char c, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }

    private static void zeichneZeile(int mitte, int steg, int z) {
        zeichneZeichen(' ', mitte - 1 - z);
        System.out.print('#');
        zeichneZeichen('*', z);
        zeichneZeichen('|', steg);
        zeichneZeichen('*', z);
        System.out.print('#');
        System.out.println();
    }
}
