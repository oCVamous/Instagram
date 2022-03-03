import java.awt.Point;

public class Scale {
    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int faktor = 2;

        Point toScale = new Point(x, y);
        skaliere(toScale, faktor);

        System.out.println("x=" + toScale.x + ", y=" + toScale.y);
    }


    // Methode
    public static void skaliere(Point toScale, int faktor) {
        int newScaleX = toScale.x * faktor;
        int newScaleY = toScale.y * faktor;
        toScale.setLocation(newScaleX, newScaleY);
    }
}