import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class selbsttest2 {
    public static void main(String[] args) {

        var file = new File("dateiSelbsttest.txt");
        Scanner scn = null;

         try {scn = new Scanner(file);
            while(scn.hasNext()) {
                var wörter = scn.next();
                System.out.println(wörter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lesefehler");
        } finally {
            if (scn != null) {
                scn.close();
            }
        }
    }
}
