import java.util.ArrayList;

public class Klausur5 {
    public static void main(String[] args) {
        double[] arr = { 10.5, 7.7, 723.0, 32.86, 22.222222 };
        ArrayList<Double> list = new ArrayList<Double>();
        copyArrayToList(arr, list);
        System.out.println(list);
    }

    public static void copyArrayToList(double[] arr, ArrayList<Double> list) {
        for (int i = arr.length-1; i >= 0; i--) {
            list.add(arr[i]);
        }
    }

}
