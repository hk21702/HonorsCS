import java.util.Scanner;
public class findx{
    public static void main(String[]args){
        double slope;
        double yIntercept;
        double xValue;
        double output;

        Scanner in = new Scanner(System.in);

        System.out.println("Input a slope");
        slope = in.nextDouble();
        System.out.println("Input a yIntercept");
        yIntercept = in.nextDouble();
        System.out.println("Input the x value");
        xValue = in.nextDouble();

        output = slope*xValue + yIntercept;

        System.out.println(output);

        in.close();
    }
}