import java.util.Scanner;
public class Zaehlen {
  public static void main(String[] args) {
    System.out.print("Bitte Wort eingeben: ");
      Scanner scn = new Scanner(System.in);
      String input = scn.next();

    int amountDigits = 0;
    int amountChars = 0;
    
    for (int i = 0; i < input.length(); i++) {
      
      char c = input.charAt(i);

      if (Character.isDigit(c)) {
        amountDigits++;
      } else if (Character.isLetter(c)) {
        amountChars++;
      }
    }
    
      if (amountDigits < amountChars) {
        System.out.println("mehr Buchstaben");
      } else if (amountChars < amountDigits) {
        System.out.println("Mehr Ziffern");
      }
      else
        System.out.println("gleich viele Buchstabenund Ziffern");
      }
    
  } 
}


