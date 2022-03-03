public class LabyrinthÜbung {
    public static final String garten1
	 = "   X   " +
	   " XXX X " +
	   " XX    " +
	   "       " +
	   "    XX " +
	   "    XX " +
	   "  X    ";

	public static final String garten2
	 = "   X   " +
	   "  X    " +
	   "   X  X" +
	   "   X   " +
	   "     X " +
	   "    X  " +
	   "  XX   ";

	public static String garten;
	   
	public static boolean blocked(int x, int y) {
	    return (garten.charAt(y*7+x) != ' ');
	}
    public static void main(String[] args) {
		garten = garten1;
	    System.out.println("Garten 1: " + suche(0,0));
		garten = garten2;
	    System.out.println("Garten 2: " + suche(0,0));
    }	
	
	public static boolean suche(int x, int y) {
        if(x == 6 && y == 6) {
            return true;
        }
        if(x > 6 || y > 6 || blocked(x, y)) {          //Ein Fall für FALSCH
            return false;
        }   
        if(suche(x+1, y)) {                  //Ein Fall für RECHTS
            System.out.print("R");         
            return true;
        }           
        if(suche(x, y+1)) {                  //Ein Fall für UNTEN
            System.out.print("R");      
            return true;
        }
        return false;            
                 
    }
}