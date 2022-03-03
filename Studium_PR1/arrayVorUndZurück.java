public class arrayVorUndZurück {

    public static void main(String[] args) {
        reverseArray();
    }

    private static void reverseArray() {
        int temp;
        int arr [] = {1, 2, 3 , 4, 5};
        //Vorwärts
        System.out.println("Ausgabe des Arrays Vorwärts:");
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Rückwärts
        System.out.println("Ausgabe des Arrays rückwärts:");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }
    
}

