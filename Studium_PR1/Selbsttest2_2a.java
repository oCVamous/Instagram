import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Selbsttest2_2a {
    public static void main(String[] args) throws FileNotFoundException {
        var f = new File("2adatei.txt");
        beispiel(f);
    }

    public static void beispiel(File f) throws FileNotFoundException {
        var scn = new Scanner(f);
        int count = 0;
        int sum = 0;

        while(scn.hasNext()) {
            var wörter = scn.next();
            count++;
            sum = sum + wörter.length();
        }

        double durchschnitt = (double)sum/count;

        System.out.println("Es befinden sich " + count + " Wörter in der Datei");
        System.out.println("Die durchschnittslänge der Wörter beträgt: " + durchschnitt);
    }
}
