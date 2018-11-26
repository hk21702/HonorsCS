import java.util.Scanner;

public class mileageTool{
    public static void main(String[]args){
        boolean x = true;
        int mpg;
    

        Scanner in = new Scanner(System.in);

        while(x == true){
            System.out.println("Enter your milage (Miles per gallon");
            mpg = in.nextInt();

            in.close();

        }
    }
}