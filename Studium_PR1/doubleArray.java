public class doubleArray {
    public static void main(String[] args) {
        double[] zahlen = {0.3, 1.5, 2.7, 8.8, 4.9, 5.0, 0.1, 0.6, 6.4, 4.2 ,7.3, 3.7, 6.1};
        jeden3tenWertAendern(zahlen);
    }

    public static void jeden3tenWertAendern(double[] zahlen) {
        //modulo
        //Schleife

        for(int i = 0; i < zahlen.length; i++){
                if((i+1) % 3 == 0) {
                    zahlen[i] = zahlen[i-1];
                    System.out.println(zahlen[i]);
                }
        }
    }
}
