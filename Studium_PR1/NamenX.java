import java.util.Scanner;
import java.io.*;

public class NamenX {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("namen.txt");             //Für Zeile 5 und 6 geht auch:
        Scanner input = new Scanner(f);             //Scanner input = new Scanner(new File("namen.txt"));
        
        int NameCounter = 0;
        int xNameCounter = 0;

        while(input.hasNext()) {
            NameCounter++;
            String name = input.next();
            if(name.charAt(0) == 'X' || name.charAt(0) == 'x') {
                xNameCounter++; 
            }
        }
        input.close();
        System.out.println("Von " + NameCounter + " Namen fangen/fängt " + xNameCounter + "Vorname(n) mit X an");
    }
}



/**In einer Datei namen.txt stehen Vornamen:
Abby Abelina Ada Adalberta Adele … Zoe Zora Zsanett Zuzanna
Sie wollen wissen, wie viele der Vornamen mit einem X anfangen. Schreiben Sie ein Programm.
*/ 

//while scanner has.next()