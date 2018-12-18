import java.util.*;

public class unit5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id = 0;
        boolean init = true;

        do {
            try {
                System.out.println("Enter Q ID");
                id = scan.nextint;
                switch (id) {
                case 81:
                    init = false;
                    q81();
                    break;

                default:
                    System.out.println("Invalid ID");
                    break;
                }
            } catch (InputMismatchException exception) {
                System.out.println("Invalid ID");
            }
        } while (init);
    }

    public static void q81() {
        Scanner scan = new Scanner(System.in);

        int hOffset, mOffset = 0;
        boolean activity = true;
        boolean early, late = false;

        System.out.println("Will there be early, or late dismissal? (Early, Late, None)");
        String type = scan.next();

        switch (type) {
            case Early:
                
                break;
            case Late:

                break;
            case None:

                break;
        
            default:
            System.out.println("Invalid Type");
                break;
        }
    }
}