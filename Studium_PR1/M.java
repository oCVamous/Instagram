import java.awt.*;

public class M {
    
    public static void methode(Point a, Point b, int k, String s) {
        a = new Point(); 
        a.x = 9;
        b.x = 15;
        k = 11;
        s = s + "Y";
    }

    public static void main(String[] args) {
        Point a = new Point(2, 2);
        Point b = new Point(4, 4);
        int k = 5;
        String s = "B";
        methode(a, b, k, s);
        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(k);
        System.out.println(s);
    }
}
