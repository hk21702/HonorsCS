package Unit2;
import java.util.Scanner;

public class scanner{
    public static void main(String[] args){
        Scanner scany = new Scanner(System.in);
        
        
        System.out.println("System Start");
        
        double y = scany.nextDouble();
        double x = Math.pow(2,y);

        System.out.println(x+1);
        scany.close();
    }
}
