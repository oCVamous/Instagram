import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Selbsttest2_1dii {
    public static void main(String[] args) {
        HashMap<String, Integer> menschen= new HashMap<String, Integer>();
        menschen.put("Lola", 32);
        menschen.put("Lisa", 33);
        menschen.put("Lara", 30);
        menschen.put("Lutz", 25);
        menschen.put("Leo", 25);
        menschen.put("Lena", 26);
        HashSet<Integer> alter= new HashSet<Integer>();
        Collections.addAll(alter, 25, 30, 31);
        System.out.println(getNamenMitGegebenemAlter(menschen, alter));
    }

    public static HashSet<String> getNamenMitGegebenemAlter(HashMap<String, Integer> menschen, HashSet<Integer> alter) {
            HashSet<String> namen= new HashSet<String>();
            for (String name : menschen.keySet()) {
                if (alter.contains(menschen.get(name))) {
                namen.add(name);
                    }
                }
            return namen;
}