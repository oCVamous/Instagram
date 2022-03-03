import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/** 
 Author Patrick Sterz
**/
public class DoubleSpace {
    
    /** Main- Methode
    **/
    public static void main(String[] args) throws FileNotFoundException {
       
        doubleSpace2("datei1.txt", "datei2.txt");
    }
    /** Datei einlesen und in eine neue Datei Schreiben**/
    public static void doubleSpace(String datei1, String datei2) throws FileNotFoundException {
        PrintStream output= new PrintStream(new File(datei2));
        Scanner input = new Scanner(new File(datei1));
        
        while (input.hasNextLine()) {
            String eingabe = input.nextLine();
            /** letze Zeile? **/
            if (!(input.hasNextLine())) {
                output.println(eingabe);
                break;
            }
            output.println(eingabe);
            /** Für fehlenden Zeilenumbruch **/
            output.println();
        }  
    }
    /** Datei einlesen un in eine neue Datei Schreiben
    + kümmert sich um Exception
     **/
    public static void doubleSpace2(String datei1, String datei2)  {
        PrintStream output= null;
        Scanner input = null;
        
        try {
            input = new Scanner(new File(datei1));
            output = new PrintStream(new File(datei2));
           
            while (input.hasNextLine()) {
                String eingabe = input.nextLine();

                output.println(eingabe);
                if (input.hasNextLine()) {
                    output.println();
                }
                
            }
        } catch (FileNotFoundException e) {    
            System.out.println("Datei nicht gefunden");
    /** Datei einlesen un in eine neue Datei Schreiben
    + Damit es aufjedenfall NACH der Eingabe geschlossen wird
     **/
        } finally {  
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }   
        }
    }
}