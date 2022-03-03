import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ZahlenAuslesen {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner fileRead = new Scanner(new File("zahlen.txt"));       //Der Scanner liest die Datei ein namens zahlen.txt
        while(fileRead.hasNextLine()) {
            String line = fileRead.nextLine(); 
            Scanner data = new Scanner(line);      
            int number1 = einlesenToken(data);
            int number2 = einlesenToken(data);
            int result = 0;
            try {
                result = berechnung(number1, number2, fileRead);
            } catch(ArithmeticException ex) {
                System.out.println("Division durch 0 nicht möglich");
                fileRead.close();
                return;
            }
            System.out.println(result);
        }
    }
    public static int einlesenToken(Scanner data) {

        if(data.hasNextInt()) {
            int number = data.nextInt();
            return number;
        }
        return -1;
    }
    public static int berechnung(int number1, int number2, Scanner fileRead) {
            if (number2 == 0) {
                throw new ArithmeticException();
            }
            int result = number1/number2;
       
        return result;
    }
}


// while die Textdatei durchlaufen mit hasnext();
// zeile speichern
// mit charAt(0,1) einzelne zahlen rausziehen und dann Berechnung  

/* 
    String number1 = line[0];
    String number2 = line[1];
    int number1 = Integer.parseInt(String number1);
    int number2 = Integer.parseInt(String number2);
    */