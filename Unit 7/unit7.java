import java.util.*;

public class unit7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid QID");

        boolean init = true;
        int id = 0;
        do {
            try {
                id = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID");
            }
            switch (id) {
            case 31:
                q31();
                init = false;
                break;
            default:
                System.out.println("Invalid ID");
                break;
            }
        } while (init);
        scan.close();
    }

    public static void q31() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scan.next();
        String y = "zZaA";

        for (int i = 0; i != word.length(); i++) {

            char x = word.charAt(i);

            if (x == y.charAt(0)) {
                x = y.charAt(2);
                System.out.print(Character.toString(x));
            } else if (x == y.charAt(1)) {
                x = y.charAt(3);
                System.out.print(Character.toString(x));
            } else {
                x += 1;
                System.out.print(Character.toString(x));
            }
        }
        scan.close();
    }

}