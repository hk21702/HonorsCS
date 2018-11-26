import java.util.*;

public class linearEq{
    public static void main(String[]args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the slope and intercept of the first line.");

        Double oneS = scan.nextDouble();
        Double oneI = scan.nextDouble();

        System.out.println("Enter the slope and intercept of the second line.");

        Double twoS = scan.nextDouble();
        Double twoI = scan.nextDouble();

        Double A= oneS-twoS;
        Double B = twoI - oneI;
        Double C = B/A;
        Double E = C*A-B;

        System.out.println("The solution to the system Y = " +oneS+"X+"+oneI+" and Y = "+twoS+"X+"+twoI+" is ("+C+", "+E+")");
        scan.close();
    }
}