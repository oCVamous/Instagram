import java.awt.Point;
public class binäreSuche {
    public static void main(String[] args) {
        Point[] arr =  new Point[] {
            new Point(1, 5), new Point(2, 1),
            new Point(3, 8), new Point(4, 2)
          };
        int x = 3;
        binarySearch(arr, 0, arr.length, x);
    }

    public static Point binarySearch(Point[] arr, int anfang, int ende, int zahl) {

        int grenze = (anfang +ende)/2;

        //1. Fall (array leer)
        if (arr.length == 0) {
            System.out.println("Array leer");
        }

        //2. Fall (nicht im array)
        if (grenze >= arr.length) {
            System.out.println("Nicht im Array");
        }

        /**Rekursion
         * 1.: >
         * 2.: <
         * 3.: ==
         * 4.: else
        */
        if (zahl > arr[grenze].x) {
            binarySearch(arr, grenze +1, ende, zahl);
        } else if (zahl < arr[grenze].x){
            binarySearch(arr, anfang, grenze-1, zahl);
        } else if (zahl == arr[grenze].x) {
            System.out.println("Die gesuchte Zahl " + zahl + " ist an der Position: " + grenze);
        } else {
            System.out.println("Nicht im Array");
        }

        return null;
    }
}

