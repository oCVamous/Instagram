import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Util classe für ein Historgram der wortlängen einer datei
 * 
 * use worthLength
 * 
 *
 */
public class WordLengths {
    /**
     * @param args
     */  
    public static void main(String[] args) {
        try {
            wordLengths("text1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * gibt ein Histogram der word länge zurück
     * 
     * @param filepath
     */
    public static void wordLengths(String filepath) throws FileNotFoundException {

        Scanner sFile = null;
        File file = new File(filepath);
        sFile = new Scanner(file);
        int[] wordLenghts = new int[81];

        int maxWordLength = 0;
        while ( sFile.hasNext() ) {
            String word = sFile.next();
            int wln = word.length();
            wordLenghts[wln] += 1;
            if ( wln > maxWordLength ) {
                maxWordLength = wln;
            }

        }
        printHistogram(maxWordLength, wordLenghts);

        sFile.close();
    }

    /**
     * gibt das histogram mit der word längen aus
     * 
     * @param maxWordLenght
     */
    public static void printHistogram(int maxWordLenght, int[] wordLenghts) {
        for (int i = 1; i <= maxWordLenght; i++) {
            System.out.print(i + ": " + wordLenghts[i] + "\t");
            for (int j = 0; j < wordLenghts[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}