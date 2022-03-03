import java.util.HashMap;
import java.util.HashSet;

public class Klausur_7a {
  public static void main(String[] args) {
    HashSet<String> set1 = new HashSet<String>();
    HashSet<String> set2 = new HashSet<String>();
    matches(set1, set2);
  }

  public static HashSet<String> matches(HashSet<String> set1, HashSet<String> set2) {
    HashSet<String> result = new HashSet<String>();
    for (String i : set1) {
      for (String j : set2) {
        if (i.equals(j)) {
          result.add(i);
        }
      }
    }
    b(set1, set2, result);
    return result;
  }

  public static HashSet<String> b(HashSet<String> set1, HashSet<String> set2, HashSet<String> result) {
    HashMap<String, HashSet<String>> gesucht = new HashMap<>();
    HashMap<String, HashSet<String>> geboten = new HashMap<>();
    gesucht.put("Hans", set1);

    var georgSet = new HashSet<String>();
    georgSet.add("Mann");
    georgSet.add("optimistisch");
    georgSet.add("sportlich");
    georgSet.add("offen");

    var marieSet = new HashSet<String>();
    marieSet.add("Frau");
    marieSet.add("humorvoll");
    marieSet.add("zuverlässig");
    marieSet.add("spontan");
    marieSet.add("sportlich");

    var annaSet = new HashSet<String>();
    annaSet.add("Frau");
    annaSet.add("humorvoll");
    annaSet.add("ehrlich");
    annaSet.add("sportlich");

    geboten.put("Georg", georgSet);
    geboten.put("Marie", marieSet);
    geboten.put("Anna", annaSet);

    var hansSet = gesucht.get("Hans");
    for (var personEntry : geboten.entrySet()) {
      // Wenn die gebotene Person nicht die gesuchte Person selbst ist
      if (personEntry != hansSet) {
        // Gehe durch jede Eigenschaft der Person
        int matchCount = 0;
        for (var personEigenschaft : personEntry.getValue()) {

          // Prüfe welche Eigenschaft sich ähnelt
          if (hansSet.contains(personEigenschaft)) {
            matchCount++;

            // Wenn es 3 ähnelnde Eigenschaften gab, haben wir genug verglichen
            if (matchCount == 3) {
              // Geboten bekommt Hans nun die Person mit den 3 ähnelnden Eigenschaften
              geboten.put("Hans", personEntry.getValue());
              break;
            }

          }

        }
      }
    }
  }
}
