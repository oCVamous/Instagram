import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.jar.JarInputStream;

public class Datenstruktur {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        /***
         * Gegeben:
         */
        TreeMap<String, ArrayList<Integer>> c = new TreeMap<String, ArrayList<Integer>>();
        /**
         * Abfrage
         */
        System.out.print("Bitte ein Wort eingeben: ");
        String wort = console.next();
        System.out.print("Bitte eine Zahl eingeben: ");
        int zahl = console.nextInt();

        c.put(wort, new ArrayList<>());
        c.get(wort).add(zahl);


        System.out.println(c);
    }
}
