import java.util.HashMap;
import java.util.Map;

public class Laender {
    public static void main(String[] args) {
        Map<String, Integer> laenderMap = new HashMap<String, Integer>();
        laenderMap.put("Deutschland", 1214);
        laenderMap.put("Polen", 891);
        laenderMap.put("USA", 204);
        // Eine Map durchlaufen (jeden Key mit Wert outprinten)
        for (String key : laenderMap.keySet()) {
            System.out.println(key + " => " + laenderMap.get(key));
            }
        // Invertiert outprinten, also zuerst Wert dann Key
        HashMap<Integer, String> laenderMapInvertiert = new HashMap<Integer, String>();
        for (String key : laenderMap.keySet()) {
            laenderMapInvertiert.put(laenderMap.get(key), key);
            System.out.println("Invertiert: " + " => " + laenderMapInvertiert);
        }
    }
        
}

