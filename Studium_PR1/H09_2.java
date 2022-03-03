import java.io.*;
import java.util.*;

public class H09_2{

    public static void linenumbers(Scanner input, PrintStream output) {
        int i = 0;
        while(input.hasNextLine()) {
            i++;
            output.println(i + " " + input.nextLine());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Dateiname der Eingabedatei eingeben: ");

        Scanner input = new Scanner(new File(console.nextLine()));
        System.out.print("Dateiname eingeben (oder 'console'): ");
        String eingabe = console.nextLine(); 

        PrintStream output;

        if(eingabe.equals("console")) {
            output = System.out;
        } else {
            output = new PrintStream(new File(eingabe));
        }
    }  
    linenumbers(input, output);   
    

 

