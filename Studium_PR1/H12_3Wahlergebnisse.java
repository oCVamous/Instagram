import java.util.HashMap;

public class H12_3Wahlergebnisse {
    public static void main(String[] args) {
        HashMap<Integer, HashMap<String, Double>> myMap = new HashMap<>();

        //Map initialisieren
        myMap.put(12, new HashMap<String, Double>());
        myMap.put(25, new HashMap<String, Double>());

        //füge Elemente zu Datenstruktur (Map-->Map) hinzu
        HashMap<String, Double> map = myMap.get(12);
        map.put("ABC", 43.3);
        map.put("XYZ", 39.1);

        map = myMap.get(25);
        map.put("ABC", 39.1);
        map.put("XYZ", 43.2);
        map.put("UVW", 2.2);

        System.out.println(myMap);
    }
}
