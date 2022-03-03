import java.util.Scanner;
import java.util.TreeMap;

public class Kunze {
    public static void main(String[] args) {
        // Programmierstruktur (am besten in methode auslagern für alle String) ausgeben
        System.out.println("<0> Statistik erstellen und Programmende");

        //Map-> Map
        TreeMap<String,TreeMap<Double,Integer> > myMap = new TreeMap<>();
        Scanner console = new Scanner(System.in);

        //Map initialisieren
        myMap.put("<0> Statistik erstellen und Programmende", new TreeMap<Double, Integer>());
        myMap.put("<1> Beerenmix Fruchtaufstrich 200ml", new TreeMap<Double, Integer>());
        myMap.put("<2> Pflaume Holunder Fruchtaufstrich 200 ml", new TreeMap<Double, Integer>());
        myMap.put("<3> Sauerkirsche Fruchtaufstrich", new TreeMap<Double, Integer>());
        myMap.put("<4> Apfel Birnen Saft 1l", new TreeMap<Double, Integer>());
        myMap.put("<5> Apfel Schorle 1l", new TreeMap<Double, Integer>());
        myMap.put("<6> Apfelsaft Familienpackung 10l", new TreeMap<Double, Integer>());
        myMap.put("<7> Brotzeitbrett Kunze", new TreeMap<Double, Integer>());


        int eingabe = console.nextInt();

        //solange wie Eingabe !=0
         
        while(eingabe != 0) {
           
            //füge Elemente zu Datenstruktur (Map-->Map) hinzu
            TreeMap<Double, Integer> map = myMap.get("<0> Statistik erstellen und Programmende");
            map.put(1.90, 100);

            while(true) {
                System.out.println("Ihre Wahl");
                int wahl = console.next();

                //Lies Eingabe
                if (eingabe == 1) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 2) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 3) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 4) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 5) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 6) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                if (eingabe == 7) {
                
                //füge Elemente zu Datenstruktur (Map-->Map) hinzu
                map = myMap.get("<0> Statistik erstellen und Programmende");
                map.put(1.90, 100);
                    }
                }
            }
            
            public static double round2(double value) {
                if (Double.isNaN(value)) return value;
                if (Double.isInfinite(value)) return value;
                return Math.round(value * 100) / 100.0;
            }
            
            

        
           
        //Statistik ausgeben
    }
}
