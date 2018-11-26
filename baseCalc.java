import java.util.Scanner;

public class baseCalc{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);    
        int baseIn = 0;
        String input;
        int baseOut = 0;

        String output;
    
        while(!(baseIn>=1 && baseIn<=10))
        {
            System.out.println("Enter the base for the input. (Between base 1 and base 10.)");
            baseIn = scan.nextInt();
        }

        System.out.println("Enter the number to be converted from base "+baseIn+"");
        input = scan.next();

        while(!(baseOut>=1 && baseOut<=10)){
            System.out.println("Enter the base for the output");
            baseOut = scan.nextInt();
        }
      output =  Integer.toString(Integer.parseInt(input, baseIn), baseOut);

      System.out.println(output);
      scan.close();
    }
}