public class boolescheMethode {
    public static void main(String[] args) {
        int a = 6;
        int b = 6;

        boolean z = isDivisor(a, b);

       System.out.println(z);
    }

    public static boolean isDivisor(int a, int b) {
        if (a % b == 0 || b % a == 0) {
          return true;
        } 
        return false;
      }
}
