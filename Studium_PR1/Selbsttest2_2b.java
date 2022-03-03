import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Selbsttest2_2b {
    public static void main(String[] args) throws FileNotFoundException {
        var f = new File("datei2b.txt");
        var scn = new Scanner(f);
        
        while (scn.hasNextLine()) {
            var line1 = scn.nextLine();
           
            if (scn.hasNextLine()) {
                var line2 = scn.nextLine();
                System.out.println(line2);
            }
            System.out.println(line1);
        }
    }
}
