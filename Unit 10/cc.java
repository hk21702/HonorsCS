import java.util.*;

public class cc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();

        double[] number = new double[amount];

        for (int i = 0; i < amount; i++) {
            number[i] = scan.nextDouble();
        }

        double max = number[0], min = number[0];
        double sum = 0;

        for (int i = 0; i < amount; i++) {
            max = Math.max(max, number[i]);
            min = Math.min(min, number[i]);

            sum += number[i];
        }
        System.out.println(sum);
        sum -= (max + min);
        System.out.println(sum);
        System.out.println(sum / (amount - 2));

        scan.close();
    }
}