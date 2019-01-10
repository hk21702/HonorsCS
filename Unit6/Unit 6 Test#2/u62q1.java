
import java.util.*;

public class u62q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scan.next();

        int length = word.length();

        char lett1 = word.charAt(length - 2);

        System.out.println(lett1);
        scan.close();
    }
}