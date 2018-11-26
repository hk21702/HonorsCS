import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Sortting sort = new Sortting();
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        ArrayList<Double> output = new ArrayList<Double>();
        Boolean init = true;

        System.out.println("Enter the number of terms");
        sort.nterms = Math.abs(scan.nextInt());

        while (init == true) {
            System.out.println("Enter the type of sortting. Options: QuickSort");
            sort.sortType = scan.next();

            switch (sort.sortType) {
            case "QuickSort":
                init = false;
                sort.quickSort();
                break;

            default:
                System.out.print("That is an invalid sort type. ");
                break;
            }
        }

    }
}

class Sortting {
    int nterms;
    String sortType;
    ArrayList <Double> terms = new ArrayList<Double>();

    public ArrayList terms() {
        System.out.println("Enter " + nterms + " terms (Double).");
        
        for (int i = nterms; i > 0; i--) {
            terms.add(scan.nextDouble());
        }
        return terms;
    }

  public void quickSort() {
    
    System.out.print(nterms);
  } 
}
 