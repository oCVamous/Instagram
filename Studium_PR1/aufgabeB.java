// Formulieren Sie eine sinnvolle Vorbedingung für die folgende Methode. 
// Ergänzen Sie in der Methode eine Überprüfung der Vorbedingung, welche zu einer geeigneten Exception führt,
// falls die Vorbedingung nicht erfüllt ist.

// a, y > 0
// a != 1
public class aufgabeB {
    public static void main(String[] args) {
      System.out.println(log(3, 5));
    }


    public static double log(double arg, double base) {
        if(arg <= 0) {
            throw new IllegalArgumentException("arg muss > 0 sein!");
        } 
        if(arg <= 0) {
            throw new IllegalArgumentException("base muss > 0 sein!");
        }
        if(base = 1) {
            throw new IllegalArgumentException("base darf nicht 1 sein!");
        }
        return Math.log(arg) / Math.log(base);
    }
}