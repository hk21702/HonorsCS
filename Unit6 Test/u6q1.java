import java.util.*;

public class u6q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a character");
        String a = scan.next();
        char b = a.charAt(0);

        System.out.println("The integer that corresponds to " + a + " is " + (int) b);
    }
}