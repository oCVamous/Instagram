import java.util.ArrayList;
import java.util.Collections;

public class LetzteLeseaufgabeC {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1,4,4,4,7,8,11,15,21,22,23,24,25,25,26,30);

        int x = 0;
        int y = key=40;
        int z = key=4;

        // den mittleren Index ermitteln:
        int mitte= (from+to)/2;
    }

    public static int binäreSuche(int[] list, int key) {
        return binäreSucheRekursiv(list, key, 0, list.length);
        }

    public static int binäreSucheRekursiv(int[] list, int key, int from, int to) {
        // den mittleren Index ermitteln:
        int mitte= (from+to)/2;
        if (list[mitte] == key) {
        // Zufallstreffer
        return mitte; // (****)
        }
        // Entscheide, ob links oder rechts weitergesucht werden muss
        if (list[mitte] > key) {
        // links weiter suchen
        return binäreSuche(list, key, from, mitte);
        }
        // rechts weiter suchen
        return binäreSuche(list, key, mitte+1, to);
        
    }
}
