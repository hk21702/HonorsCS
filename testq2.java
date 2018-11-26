import java.util.*;

public class testq2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer output = 100;
        while (output > 84) {
            output = (int) (Math.random() * 100);
        }
        int base51 = output / 25;
        int base52 = (output % 25) / 5;
        int base53 = (output % 25) % 5;
        int base61 = output / 36;
        int base62 = (output % 36) / 6;
        int base63 = (output % 36) % 6;
        System.out.println("Convert " + base51 + "" + base52 + "" + base53 + " in base-5 to base-6.");
        int user = scan.nextInt();
        System.out.println("The correct answer is " + base61 + "" + base62 + "" + base63);
    }
}