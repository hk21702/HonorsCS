package Unit4;

import java.util.*;

public class u4q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer on the interval [50,120)");

        int x = 0;

        try {
            x = scan.nextInt();
            if(50>x|x>=120)
            System.out.println("Invalid Entry");
            else if(x%2==0)
            System.out.println(x +" is even");
            else
            System.out.println(x +" is odd");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Entry");
        }
    }
}