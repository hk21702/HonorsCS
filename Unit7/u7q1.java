import java.util.*;

public class u7q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 integers, separated by a space.");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int start = 0;
        int end = 0;
        if (num1 > num2) {
            start = num2;
            end = num1;
        } else {
            start = num1;
            end = num2;
        }
        int count = 1;
        int output = 3 * count;
        while (output < end) {

            if (output > start)
                System.out.print(output + " ");

            count++;
            output = 3 * count;
        }
    }
}