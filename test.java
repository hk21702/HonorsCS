import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an interger between 1 and 9");

        int number = scan.nextInt();

        for (int x = 0; x <= number; ++x) { //top half plus center
            for (int space = 0; space < number - x; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (x * 2) - 1; i++) {
                System.out.print(x);
            }
            System.out.println("");
        }
        for (int x = number - 1; x > 0; --x) { //bottom half
            for (int space = 0; space < number - x; space++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (x * 2) - 1; i++) {
                System.out.print(x);
            }
            System.out.println();
        }
        scan.close();
    }
}