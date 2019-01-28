package Unit5;

import java.util.*;

public class t5q1 {
    public static void main(String[]args){
        int numb1 = (int) (Math.random()*11);

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer on [0,11)");
        int user1 = scan.nextInt();
        
        if(numb1==user1)
        System.out.println("Correct, you win $100");
        else if(user1==numb1-1|user1==numb1+1)
        System.out.println("The correct number is " + numb1 +", you win $25");
        else if(user1%2==numb1%2)
        System.out.println("The correct number is " +numb1+ ", you win $2");
        else
        System.out.println("The correct number is " + numb1 + ", you lose.");
    }
}