import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

public class Altklausur4 {

    public static void main(String[] args) {
        printProjects("namenABC.txt");
    }

    public static void printProjects(String fileName) {
        var projects = new TreeMap<String, List<String>>();
        
        File file = new File(fileName);
        // Öffne einen Scanner in ein try-Resource (scanner wird nach try geschlossen)
        try(Scanner scn = new Scanner(file)) {
            
            while (scn.hasNextLine()) {
                String[] lineContent = scn.nextLine().split(" ");
                
                // Erstelle eine Liste unter dem Key, falls keins existiert
                if (!projects.containsKey(lineContent[0])) {
                    List<String> list = new ArrayList<String>();
                    projects.put(lineContent[0], list);
                    list.add(lineContent[1]);
                  } else {
                    projects.get(lineContent[0]).add(lineContent[1]);
                  } 
            }
            
        } catch (FileNotFoundException exception) {
            System.out.println("Lesefehler");
        }

        for (var entry : projects.Map.Entry<String, List<String>>) {
            System.out.println(entry.getKey() + ": " + String.join(" ", entry.getValue()));
        }
    }
}