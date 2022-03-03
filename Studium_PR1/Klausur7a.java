import java.util.HashMap;
import java.util.HashSet;

public class Klausur7a {
    public static void main(String[] args) {
        HashMap<String, HashSet<String>> gesucht = new HashMap<>();
        HashMap<String, HashSet<String>> geboten = new HashMap<>();
        HashSet<String> result = new HashSet<String>();
        String[] namen = {"Hans", "Georg", "Marie", "Anna"};
        
        var hansSetGeboten = new HashSet<String>();
        hansSetGeboten.add("Mann");
        hansSetGeboten.add("tierlieb");
        hansSetGeboten.add("naturverbunden");
        hansSetGeboten.add("ehrlich");

        var hansSetGesucht = new HashSet<String>();
        hansSetGesucht.add("Frau");
        hansSetGesucht.add("tierlieb");
        hansSetGesucht.add("humorvoll");
        hansSetGesucht.add("intelligent");
        hansSetGesucht.add("zuverlässig");
        hansSetGesucht.add("sportlich");

        var georgSetGeboten = new HashSet<String>();
        georgSetGeboten.add("Mann");
        georgSetGeboten.add("optimistisch");
        georgSetGeboten.add("sportlich");
        georgSetGeboten.add("offen");

        var georgSetGesucht = new HashSet<String>();
        georgSetGesucht.add("Frau");
        georgSetGesucht.add("optimistisch");
        georgSetGesucht.add("respektvoll");
        georgSetGesucht.add("intelligent");
        georgSetGesucht.add("treu");

        var marieSetGeboten = new HashSet<String>();
        marieSetGeboten.add("Frau");
        marieSetGeboten.add("humorvoll");
        marieSetGeboten.add("zuverlässig");
        marieSetGeboten.add("spontan");
        marieSetGeboten.add("sportlich");

        var marieSetGesucht = new HashSet<String>();
        marieSetGesucht.add("Mann");
        marieSetGesucht.add("tierlieb");
        marieSetGesucht.add("treu");
        marieSetGesucht.add("ehrlich");
        marieSetGesucht.add("sportlich");

        var annaSetGeboten = new HashSet<String>();
        annaSetGeboten.add("Frau");
        annaSetGeboten.add("humorvoll");
        annaSetGeboten.add("ehrlich");
        annaSetGeboten.add("sportlich");

        var annaSetGesucht = new HashSet<String>();
        annaSetGesucht.add("Mann");
        annaSetGesucht.add("optimistisch");
        annaSetGesucht.add("intelligent");
        annaSetGesucht.add("ehrlich");
        annaSetGesucht.add("sportlich");

        geboten.put("Hans", georgSetGesucht);
        geboten.put("Georg", georgSetGesucht);
        geboten.put("Marie", marieSetGesucht);
        geboten.put("Anna", annaSetGesucht);

        gesucht.put("Hans", hansSetGeboten);
        gesucht.put("Georg", georgSetGeboten);
        gesucht.put("Marie", marieSetGeboten);
        gesucht.put("Anna", annaSetGeboten);

        result = matches(hansSetGesucht, marieSetGeboten);
        System.out.println(result);
    }

    public static HashSet<String> matches(HashSet<String> hansSetGesucht, HashSet<String> marieSetGeboten) {

        HashSet<String> result = new HashSet<String>();
        for (String i : hansSetGesucht) {
          for (String j : marieSetGeboten) {
            if (i.equals(j)) {
              result.add(i);
            }
          } 
        }
        return result;
    }
    

    public static void check(String name1, String name2, HashMap<String, HashSet<String>> Gesucht, HashMap<String>, HashSet<String>> Geboten) {
        HashSet<String> eigenschaft1 = matches(Gesucht.get(name1), Geboten.get(name2));
        HashSet<String> eigenschaft2 = matches(Geboten.get(name1), Gesucht.get(name2));

        if(eigenschaft1.size() >= 3 && eigenschaft2.size() >= 3) {
            System.out.println(name1 + "sucht und findet bei " + name2 + ": " + eigenschaft1);
            System.out.println(name2 + "sucht und findet bei " + name1 + ": " + eigenschaft2);
        } else if(eigenschaft1.size() >= 3 || eigenschaft2.size() >= 3) {
            System.out.println(name1 + "sucht und findet bei " + name2 + ": " + eigenschaft1);
            System.out.println(name2 + "sucht und findet bei " + name1 + ": " + eigenschaft2);
        }
    }

    public static void match(String[] namen, HashMap<String, HashSet<String>> gesucht,
    HashMap<String, HashSet<String>> geboten){
        
    }
}



