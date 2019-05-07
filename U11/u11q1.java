import java.util.*;

public class u11q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers would you like to enter?");

        int numb = scan.nextInt();

        int ints[] = new int[numb];
        int sum = 0;
        System.out.println("Please enter the integers, separated by spaces.");
        for (int i = 0; i < numb; i++) {
            ints[i] = scan.nextInt();
            sum += ints[i];
        }

        for (int j = numb - 1; j >= 0; j--) {
            System.out.print(ints[j] + " ");
        }
        double average = ((double)sum)/((double)numb);
        System.out.println("The average is " + average);

        int min = ints[0];
        int max = ints[0];

        for(int j : ints){
            if(j<min){
                min = j;
            }
            if(j>max){
                max = j;
            }
        }

        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
    }
}