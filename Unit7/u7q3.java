import java.util.*;

public class u7q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter integers to sum.");

        int output = 0;
        int input = scan.nextInt();

        while (input != 0) {
            output += input;
            input = scan.nextInt();
        }

        System.out.println("The sum of the entered integers is " + output);
        scan.close();
    }
}