import java.util.*;

public class u7q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word.");

        String word = scan.next();
        int length = word.length() - 1;

        while (length > -1) {
            System.out.print(word.charAt(length));
            length--;
        }
    }
}