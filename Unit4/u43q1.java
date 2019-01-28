package Unit4;

import java.util.*;

public class u43q1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 integers (seperated by a space");
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();

        int smallx =Math.min(x1, x2);
        int largex = Math.max(x1, x2);
    
        if(largex%smallx!=0)
        System.out.println(smallx + " is not a factor of " + largex);
        else
        System.out.println(smallx + " is a factor of " + largex +" because "+ smallx +" * " +largex/smallx+" = " +largex);
    }
}