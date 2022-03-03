import java.util.Arrays;

public class WerteUmdrehen {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            
        }
        System.out.println(Arrays.toString(array) );

        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }

    
}
