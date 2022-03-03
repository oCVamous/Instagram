import java.util.Scanner;

public class Selbsttest2_2d {
    public static void main(String[] args) {
        printReversed("Glückliche Tage sind kurz");
    }

    public static void printReversed(String input) {
        // String nach Leerzeichen aufspalten
        for (String item : input.split(" ")) {
    
          // Gehe durch jedes Zeichen des Wortes rückwärts
          for (int i = item.length()-1; i >= 0; i--) {
    
            // Gebe das Zeichen aus
            System.out.print(item.charAt(i));
          }
    
          // Füge am Ende des Wortes noch ein Leerzeichen hinzu
          System.out.print(" ");
        }        
    }
}