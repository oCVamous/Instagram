import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Test10 {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner fileRead = new Scanner(new File("zahlen.txt"));       //Der Scanner liest die Datei ein namens zahlen.txt
    reverse(fileRead);
    }

    public static void reverse(Scanner fileRead) {
        if (fileRead.hasNextLine()) {
            String line = fileRead.nextLine();
            reverse(fileRead);
            System.out.println(line);
        }
    }
}