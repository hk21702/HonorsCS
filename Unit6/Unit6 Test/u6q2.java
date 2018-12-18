import java.util.*;

public class u6q2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word.");
        String a = scan.next();

        int leng = a.length();

        String a1 = a.substring(0, leng - 2);
        String a2 = a.substring(leng - 1);
        String a3 = a.substring(leng - 2, leng - 1);

        System.out.println(a1 + a2 + a3);
    }
}