/**
Hauptmethode
 */
public class VierQuadrate { 
    public static final int SIZE = 3;      

    public static void main(String[] args) {        
        koerper();
    }

  /**
  ====+=====
   */
    public static void kopf() {                      
        for (int  i = 0; i <= SIZE; i++) {
            System.out.print("=");
        }
        System.out.print("+");
        for (int  i = 0; i <= SIZE; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }

    /**
    #   |    #
    */
    public static void mitte() { 
        for (int  j = 0; j < SIZE; j++) {                    
            System.out.print("#");
            for (int  i = 0; i < SIZE; i++) {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int  i = 0; i < SIZE; i++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }

    /**
     Das hier ist die Universelle Methode, sprich die Methode der Methoden!
    */
    public static void koerper() {                   
        kopf();                                         
        mitte();
        kopf();
        mitte();
        kopf();
    }
}