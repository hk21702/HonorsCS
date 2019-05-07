import java.util.*;

public class u11q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers would you like to enter?");

        int integers = scan.nextInt();

        int list2[] = new int[integers];
        int list1[] = new int[integers];

        System.out.println("Please enter the integers");
        int indexes[] = new int[integers];
        int index = (int) (Math.random() * integers);
        for (int i = 0; i < integers; i++){
            indexes[i] =-1;
        }
        for(int i = 0; i< integers; i++){
            list2[i]= scan.nextInt();
        }
        for (int i = 0; i < integers; i++) {
            boolean newIndex = false;
            while (!newIndex) {
                boolean error = false;
                index = (int) (Math.random() * (integers));
                for (int j : indexes) {
                    if (j == index) {
                        error = true;
                    }
                }
                if (error == false) {
                    newIndex = true;
                }
            }
            indexes[i] = index;
            list1[index] = list2[i];
        }

        for(int numbs : list1){
            System.out.print(numbs + " ");
        }
    }
}