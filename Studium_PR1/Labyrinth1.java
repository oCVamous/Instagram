public class Labyrinth1 {

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
        if (!findWayRecursive(0, 0)) {
            System.out.println("Sackgasse");
        } else {
            System.out.println("Ziel");
        }
        
        garten = garten2;
        if (!findWayRecursive(0, 0)) {
            System.out.println("Sackgasse");
        }
    }

    public static boolean findWayRecursive(int x, int y) {
        if (x == 6 && y == 6) {
            return true;
        }
        if (x > 6 || y > 6 || blocked(x, y)) {
            return false;
        }
        if (findWayRecursive(x + 1, y)) {
            System.out.print("R ");
            return true;
        }
        if (findWayRecursive(x, y + 1)) {
            System.out.print("U ");
            return true;
        }

        return false;
    }
}