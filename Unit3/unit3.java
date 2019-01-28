package Unit3;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class unit3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int question = scan.nextInt();
        switch (question) {
        case 71:
            unit3.question71();
            break;
        case 72:
            unit3.question72();
            break;
        case 61:
            unit3.question61();
            break;
        case 81:
            unit3.question81();
            break;
        case 83:
            unit3.question83();
            break;
        case 84:
            unit3.question84();
            break;
        case 85:
            unit3.question85();
            break;
        default:
            System.out.println("Not a question.");
            break;
        }
        scan.close();
    }

    public static void question71() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of scores");
        int inputs = scan.nextInt();
        System.out.println("Enter scores. (" + inputs + " inputs)");

        ArrayList<Double> scores = new ArrayList<Double>();
        for (int i = 0; i < inputs; i++) {
            scores.add(scan.nextDouble());
        }

        double min = scores.get(0);
        double max = scores.get(0);

        for (int i = 1; i < inputs; i++) {
            min = Math.min(min, scores.get(i));
            max = Math.max(max, scores.get(i));
        }

        double output = 0;
        for (int i = 0; i < inputs; i++) {
            if (i != scores.indexOf(min) & i != scores.indexOf(max)) {
                output += scores.get(i);
            }
        }
        output /= inputs - 2;

        System.out.println("Score is: " + output);

        scan.close();
    }

    public static void question72() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the slope and intercept of the first line.");
        double s1 = scan.nextDouble();
        double i1 = scan.nextDouble();

        System.out.println("Enter the slope and intercept of the second line.");
        double s2 = scan.nextDouble();
        double i2 = scan.nextDouble();

        double start = i2 - i1;
        double slope = s1 - s2;

        try {
            double output = start / slope;
            if (!Double.isInfinite(output) & !Double.isNaN((output))) {
                System.out.println(output);
            } else {
                System.out.println("These lines will never meet");
            }
        } catch (ArithmeticException e) {
            System.out.println("These lines will never meet");
        }
        scan.close();
    }

    public static void question61() {
        int diviResult = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 9 + 1);
        int a = diviResult * b;

        System.out.println(a + "/" + b);
        System.out.println("The correct answer is: " + diviResult);
    }

    public static void question81() {
        int answer = (int) (Math.random() * 99 + 10);
        int a = (int) (Math.random() * 20 + 1);
        int b = answer / a;
        System.out.println(a + "*" + b + "=" + answer);
    }

    public static void question83() {
        Scanner scan = new Scanner(System.in);
        System.out.println((int) (scan.nextDouble() + .5));
        scan.close();
    }

    public static void question84() {
        Scanner scan = new Scanner(System.in);
        System.out.println(((int) (scan.nextDouble() * 10 + .5) / 10.0));
        scan.close();
    }

    public static void question85() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of decimal points to round to");
        int decimal = 0;
        boolean init = true;
        while (init == true) {
            try {
                decimal = scan.nextInt();
            } catch (InputMismatchException exception) {
                throw new IllegalArgumentException("Input must be a decimal");
            }
        }

        System.out.println("Enter the number to be rounded");
        System.out.println(
                "Output: " + ((int) (scan.nextDouble() * Math.pow(10, decimal) + .5) / Math.pow(10.0, decimal)));
    }
}

class help {
    public int rng() {
        return (int) Math.random() * 9 + 1;
    }
}
