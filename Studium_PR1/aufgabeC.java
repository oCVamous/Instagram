import java.util.Scanner;
public class aufgabeC {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        
        
      System.out.print("Bitte geben Sie ihr Alter in Zahlen ein: ");
      int alter = scn.nextInt();
      String einstufung;

      einstufung = alter < 1 ? "Baby" : 
        alter < 3 ? "Kleinkind" :
        alter < 6 ? "Vorschulkind" :
        alter < 13 ? "Schulkind" :
        alter < 18 ? "Teenager" : "Erwachsen";

    System.out.println(einstufung);
  }
}
// String text= geschlecht=='W' ? "weiblich" : "männlich";
