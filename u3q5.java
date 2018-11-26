import java.util.*;

public class u3q5 {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10), num2 = (int) (Math.random() * 10);
        int money = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 2-digit number as your guess.");

        int input = scan.nextInt();

        int inum1 = (int) (input / 10);
        int inum2 = input - (inum1 * 10);

        if (inum1 == num1) {
            if (inum2 == num2)
                money = 5000;
            else
                money = 1000;
        } 
        else if (inum2 == num1 & inum1 == num2)
            money = 2500;
        else if (inum2 == num2 | inum2 == num1)
            money = 1000;
        else if (inum1 == num2) {
            money = 1000;
        }

        if (money != 0)
            System.out.println("You win $" + money);
        else
            System.out.println("You lose.");
    }
}