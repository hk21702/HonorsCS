import java.util.*;

public class q32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int amount = scan.nextInt();
        int numbers[] = new int[amount];
        for (int i = 0; i < amount; i++)
            numbers[i] = scan.nextInt();
        int max1 = 0, max2 = 0;
        for (int i = 0; i < amount; i++) {
            max1 = Math.max(max1, numbers[i]);
        }
        for (int i = 0; i < amount; i++) {
            if (numbers[i] != max1)
                max2 = Math.max(max2, numbers[i]);
        }

        System.out.println(max1 + " " + max2);

        scan.close();
    }
}