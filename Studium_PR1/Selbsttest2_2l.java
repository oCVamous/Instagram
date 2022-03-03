import java.awt.Point;
public class Selbsttest2_2l {
    public static void main(String[] args) {
        Point[] arr =  new Point[] {
            new Point(1, 5), new Point(2, 1),
            new Point(3, 8), new Point(4, 2)
          };
        int x = 3;
        binarySearch(arr, 0, arr.length, x);
    }
    public static Point binarySearch(Point[] arr, int anfang, int ende, int zahl) {

        int grenze = anfang + ((ende - anfang) / 2);
        if (arr.length == 0) {
            System.out.println("Array leer");
        }
        if (grenze >= arr.length) {
            System.out.println(zahl + "nicht im Array enthalten.");
        }

        if (zahl > arr[grenze].x) {
            binarySearch(arr, grenze + 1, ende, zahl);
        } else if (zahl < arr[grenze].x && anfang != grenze) {
            binarySearch(arr, anfang, grenze - 1, zahl);
        } else if(zahl == arr[grenze].x) {
            System.out.println(zahl + " an Position " + grenze + " enthalten.");
        } else{
            System.out.println(zahl + " nicht im Array enthalten.");
        }
        return null;

    }
}
