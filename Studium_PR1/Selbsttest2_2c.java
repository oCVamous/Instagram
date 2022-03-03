public class Selbsttest2_2c {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 12};
        int min = 0;
       minGap(arr);
       System.out.println(min); 
    }

    public static int minGap(int[] arr) {
        int min = arr[1] - arr[0];

        for(int i = 0; i<arr.length; i++) {
            int abstand = arr[i] - arr[i-1];
            if(min<abstand) {
                min = abstand;
            }
        }
        return min;
    }
}