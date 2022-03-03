public class selbsttest2_1ci {
    public static void main(String[] args) {
        double[] arr = { 0.1, 4.3, 8.8, 2.4};
        min(arr);
    }

    private static void min(double[] arr) {
        double Minimum = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (Minimum > arr[i])
            Minimum = arr[i];      
        }
        System.out.println("Kleinste Zahl: " + Minimum);
    }
}
