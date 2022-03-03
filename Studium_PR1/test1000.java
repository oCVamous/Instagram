import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

class test1000 {
    public static void main(String[] args) {
        String fileName = "hallo.txt";
        printProjects(fileName);
    }

    public static void printProjects(String fileName) {
        var projects = new TreeMap<String, List<String>>();
        
        var file = new File(fileName);
        // Öffne einen Scanner in ein try-Resource (scanner wird nach try geschlossen)
        try(var scanner = new Scanner(file)) {
            
            while (scanner.hasNextLine()) {
                var lineContent = scanner.nextLine().split(" ");
                
                // Erstelle eine Liste unter dem Key, falls keins existiert
                if (!projects.containsKey(lineContent[0])) {
  			        var list = new ArrayList<String>();
  			        list.add(lineContent[1]);
  			        projects.put(lineContent[0], list);
		    } else {
  			    projects.get(lineContent[0]).add(lineContent[1]);
		    }

        }
        } catch (FileNotFoundException exception) {
            System.out.println("Lesefehler");
        }

        for (String key : projects.keySet()) {
            System.out.println(key + " : " + projects.get(key));
            }
    }
}