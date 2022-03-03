import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class DateienLesenUndSchreiben {
        public static void main(String[] args) throws IOException {
            //dateien sollten richtig abgelegt sein!
            doubleSpace("datei1.txt", "datei2.txt"); 
        }
        //
        public static void doubleSpace(String datei1, String datei2) throws IOException {
    
            //erstellt einen neuen Scanner zum lesen der Datei
            Scanner scan = null;
            Writer wr = new FileWriter(datei2);
    
            //try-catch ist Teil der Exceptions
            try {
                //lesen der Datei
                scan = new Scanner(new File(datei1));
    
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //solange Zeilen im 1. file vorhanden sind läuft die Schleife
            while (scan.hasNextLine()) {
    
                //beschreiben der 2. Datei
                wr.write(scan.nextLine());
    
                if (scan.hasNext()) {
                    // "\n" steht für einen Zeilenumbruch
                    wr.write("\n\n");
                }                
            }wr.write("\n");
           
            //Scanner und writer schließen
            scan.close();
            wr.close();
        }
    }

