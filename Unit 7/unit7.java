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
            case 11:
                q11();
                init = false;
                break;
            default:
                System.out.println("Invalid ID");
                break;
            }
        } while (init);
        scan.close();
    }

    public static void q11() {

    }
}