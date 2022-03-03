import java.util.Random;
public class Magic {
    public static void main(String[] args) {
        Random rand = new Random();
        int start = 1;

        for(int i = 0; i<=10; i++) {
            int n = rand.nextInt(10);
            
            if(n >= 0 && n<=5) {
                start++;
            }else if(n >= 6 && n<=8) {
                start--;
        }
        System.out.println(rand);
    }
    }
}