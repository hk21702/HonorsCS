import java.util.*;

public class u4q7{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);

        int x = (int) (Math.random()*6);

        System.out.println("Guess the integer on the interval [0,6)");

        int user = scan.nextInt();

        if (user == x)
        System.out.println("Correct.");
        else{
            System.out.println("Incorrect, please try again.");
            user = scan.nextInt();
            if (user == x)
            System.out.println("Correct.");
            else
            System.out.println("Incorrect, the correct answer is " + x +".");

        }
    }
}