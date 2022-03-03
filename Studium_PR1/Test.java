/**In einer Datei namen.txt stehen Vornamen:
Abby Abelina Ada Adalberta Adele … Zoe Zora Zsanett Zuzanna
Sie wollen wissen, wie viele der Vornamen mit einem X anfangen. Schreiben Sie ein Programm.
*/ 
import java.io.*;
import java.util.Scanner;
public class Test {
  public static void main(String[] args) throws FileNotFoundException{
    Scanner scn = new Scanner(new File("namen.txt"));

    int nameCounter = 0;
    int xNameCounter = 0;

    while(scn.hasNext()) {
      NameCounter++;
      String name = scn.next();
      if (name.charAt(0) == 'X' || name.charAt(0) == 'x') {
        xNameCounter++; 
      }
    }
    System.out.println("Von " + NameCounter + " Namen fangen/fängt " + xNameCounter + "Vorname(n) mit X an");
  }
}
        
        
    