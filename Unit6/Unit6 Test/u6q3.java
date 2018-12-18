import java.util.*;

public class u6q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word.");
        String a = scan.next();

        int length = a.length() - 1;
        int random = (int) (Math.random() * length) + 1;

        if (random == length)
            random--;

        char ne = 0;
        char orig = a.charAt(random);
        if (orig == 122)
            orig = 97;
        else if (orig == 90)
            orig = 65;
        else
            orig++;

        String a1 = a.substring(0, random), a2 = a.substring(random + 1);

        System.out.println(a1 + orig + a2 + " (" +a.charAt(random) + " was selected, replaced by " + orig+")");

    }
}