import java.util.*;

public class chem{
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        RealGL();

    }

    public static void RealGL(){
        Scanner scan = new Scanner(System.in);
        HashMap<String, Double> values = new HashMap<>();
        boolean init = true;

        while (init == true){
            System.out.println("What value are is being found? (P,V,T)");
            String value = scan.nextLine();
            if(value.equalsIgnoreCase("P")|value.equalsIgnoreCase("V")|value.equalsIgnoreCase("T")){
                init = false;
            }
            System.out.println("Enter the values for (P, V, T, n ,R, T, a, b). ");
            values.put("P", scan.nextDouble());
            values.put("V", scan.nextDouble());
            values.put("T", scan.nextDouble());
            values.put("n", scan.nextDouble());
            values.put("R", scan.nextDouble());
            values.put("T", scan.nextDouble());
            values.put("a", scan.nextDouble());
            values.put("b", scan.nextDouble());

            if(value.equalsIgnoreCase("P")){
                p = 
            }
        }


    }
}