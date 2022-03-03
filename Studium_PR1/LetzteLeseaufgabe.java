import java.util.ArrayList;
import java.util.ListIterator;

public class LetzteLeseaufgabe {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        ListIterator<Integer> iter= list.listIterator();
        while (iter.hasNext()) {
            int val = iter.next();
            if (val % 3 == 0 ) {
                iter.remove();
                }
            }
    }
}
