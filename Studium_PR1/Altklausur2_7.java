public class Altklausur2_7 {
    public static void main(String[] args) {
        beispiel();
    }

    public static void beispiel() {
        String c = "12314+A+A123Ay";

    boolean good = true;
    int plusIndex = -1;
    // Gehe durch jedes + im String
    while((plusIndex = c.indexOf("+", plusIndex+1)) != -1) {

    // Wenn nach dem + eine Zahl folgt und es sich noch im String befindet
        if (plusIndex+1 < c.length() && Character.isDigit(c.charAt(plusIndex+1))) {
            good = false;
            break;
        }
    }
            
    if (good) {
        // Wenn AAA hintereinander nicht gefunden wird, ist indexOf("AAA") == -1
        // Und wenn der Inhalt kein y und Y hat 
        good = c.contains("AAA") && !c.contains("y") && !c.contains("Y");
    }

    System.out.println(good); // false
    }
}
