import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test40 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Your word? ");
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();

        //search List for a word using indexOf
        List <String> words = readBook(mobydick.txt);
        int index= words.indexOf(word);
        if(index>= 0) {
            System.out.println(word + " is word #" + index);
        } else {
            System.out.println(word + " ist not found.");
        }
    }

    public static ArrayList <String> readBook(String filename) {
        throws FileNotFoundException {
            ArrayList<String> words = new ArrayList<>();
            Scanner in = new Scanner(new File(filename))
            
            while (in.hasNext()) {
                words.add(in.next());
            }
            return words;
        }
        
    }
}
