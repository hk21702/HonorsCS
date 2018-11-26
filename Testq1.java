import java.util.*;

public class Testq1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int output = (int) (Math.random()*9)+10;
        int in1 = (int) (Math.random()*9+1);
        int in2 = output-in1;

        System.out.println(in1 + " + " + in2);
        int i = scan.nextInt();
        System.out.println("The correct answer is " +output);
    }
}