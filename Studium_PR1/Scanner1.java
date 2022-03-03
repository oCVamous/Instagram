import java.util.Scanner;

public class Scanner1 {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
        
        
      System.out.print("Wort eingeben: ");
      String a =scn.next();
        
      System.out.print("Index eingeben : ");
      int i = scn.nextInt();
        
      System.out.println(a.charAt(i));
  }
}
