public class Labyrinth {
    public static final String garten1 = "   X   " +
            " XXX X " +
            " XX    " +
            "       " +
            "    XX " +
            "    XX " +
            "  X    ";

    public static final String garten2 = "   X   " +
            "  X    " +
            "   X  X" +
            "   X   " +
            "     X " +
            "    X  " +
            "  XX   ";

    public static String garten;

    public static boolean blocked(int x, int y) {
        return (garten.charAt(y * 7 + x) != ' ');
    }

    public static void main(String[] args) {
        garten = garten1;
        System.out.println("Garten 1: " + suche(0, 0));
        garten = garten2;
        System.out.println("Garten 2: " + suche(0, 0));
    }

    // TODO: Methode suche fehlt
    public static String suche(int 0, int 0) {
        if () {        //Ziel!
            return "Ziel";
            }
            if (blocked(x, y)) {          // Wand!
                return "Wand";
            }
            String a = suche(x+1, y);
            
            if(a.endsWith("Ziel")) {
                return "R" + a;
            }
            suche(x, y+1);
        }
    // Brotkrumen ablegen
    irrgarten[y][x]= '*';
    }
}