// alte Datei nehmen, auslesen
// + die eingabe hinzufügen
import java.util.*;
import java.io.File;
import java.io.*;

public class Dateiname_Zeile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie einen Dateinamen ein: ");
        String dateiname = input.next();
        input.nextLine();

        PrintStream output = new PrintStream(new FileOutputStream(dateiname, true));
        System.out.print("Bitte geben Sie eine Teixtzeile zum hinzufügen ein: ");
        String textzeile = input.nextLine();

        output.println();
        output.println(textzeile);
        output.close();

        Scanner fileRead = new Scanner(new File(dateiname));
        while(fileRead.hasNextLine()) {
            System.out.println(fileRead.nextLine());
        }
    }
}