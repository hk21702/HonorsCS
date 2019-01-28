package Unit5;

import java.util.*;

public class t5q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many dice would you like to roll, 1 or 2?");
        int die = scan.nextInt();

        switch (die) {
        case 1:
            System.out.println((int)(Math.random()*5)+1);
            break;
        case 2:
            System.out.print((int) (Math.random() * 6) + 1);
            System.out.println(" " + (int) ((Math.random() * 5)+1));

            break;

        default:
            System.out.println("Invalid Entry!");
        }
    }
}