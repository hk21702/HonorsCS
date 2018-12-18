import java.util.*;

public class unit4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean init = true;
        int question = 0;

        System.out.println("Enter a question ID");

        while (init == true) {
            question = scan.nextInt();

            switch (question) {
            case 31:
                init = false;
                question31();
                break;
            case 32:
                init = false;
                question32();
                break;
            case 33:
                init = false;
                question33();
                break;
            case 61:
                init = false;
                question61();
                break;
            case 62:
                init = false;
                question62();
                break;
            default:
                System.out.println("That is not a valid question");
                init = true;
            }
        }
        scan.close();
    }

    public static void question31() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 2 integers");

        boolean init = true;
        while (init) {
            try {
                int number1 = scan.nextInt();
                int number2 = scan.nextInt();
                init = false;
                if ((number1 % number2) != 0)
                    System.out.println(number2 + " is not a factor of " + number1);
                else
                    System.out.println(number2 + " is a factor of " + number1 + " because " + number2 + " * "
                            + (number1 / number2) + " = " + number1);
            } catch (InputMismatchException e) {
                System.out.println("Those are not valid integers");
                scan.nextLine();
            }
        }
        scan.close();
    }

    public static void question32() {
        Scanner scan = new Scanner(System.in);

        int number = (int) (Math.random() * 10);
        for (int i = 0; i < 3; i++) {
            System.out.println("Guess a number between 0 and 10, including 0");
            boolean init = true;
            int num = 0;
            do {
                if (scan.hasNextInt()) {
                    num = scan.nextInt();
                    if (num > number) {
                        System.out.println("Too high");
                        scan.nextLine();
                        init = false;
                    }

                    else if (num < number) {
                        System.out.println("Too low");
                        scan.nextLine();
                        init = false;
                    } else {
                        System.out.println("Correct");
                        scan.nextLine();
                        init = false;
                        i = 3;
                    }
                } else {
                    scan.nextLine();
                    System.out.println("That is not an integer");
                }
            } while (init);
        }
        scan.close();
    }

    public static void question33() {
        Scanner scan = new Scanner(System.in);
        boolean init = true;
        int base = 0;
        do {
            System.out.println("Enter a base for the input between 2 and 10");
            if (scan.hasNextInt()) {
                base = scan.nextInt();
                if (base > 10 | base < 2) {
                    System.out.println("That is not between 2 and 10");
                } else
                    init = false;
            } else
                System.out.println("Base must be an integer.");
            scan.nextLine();
        } while (init);

        init = true;

        do {
            if (scan.hasNextInt()) {
                int number = scan.nextInt();
                int numbermod = number;
                int check = 0;
                int length = (int) (Math.log10(number) + 1);
                init = false;
                for (int i = 0; i > length; i++) {
                    check = numbermod % 10;
                    if (check > (base - 1)) {

                    }
                    numbermod = numbermod / 10;
                }
            } else {
                System.out.println("That is not an int in base " + base);
                scan.nextLine();
            }
        } while (init);
        scan.close();
    }

    public static void question61() {
        ArrayList<Integer> attacker = new ArrayList<>();
        ArrayList<Integer> defender = new ArrayList<>();

        for (int i = 0; i < 3; i++)
            attacker.add(i, (int) (Math.random() * 6 + 1));

        for (int i = 0; i < 2; i++)
            defender.add(i, (int) (Math.random() * 6 + 1));

        int defenderMax = Math.max(defender.get(0), defender.get(1));
        int defenderMin = Math.min(defender.get(0), defender.get(1));

        int attackerMax1 = Math.max(attacker.get(0), Math.max(attacker.get(1), attacker.get(2)));
        int attackerMax2 = 0;

        System.out.println("Attacker - " + attacker.get(0) + " " + attacker.get(1) + " " + attacker.get(2));
        System.out.println("Defender - " + defender.get(0) + " " + defender.get(1));

        if (attackerMax1 == attacker.get(0))
            attackerMax2 = Math.max(attacker.get(1), attacker.get(2));
        else if (attackerMax1 == attacker.get(1))
            attackerMax2 = Math.max(attacker.get(0), attacker.get(2));
        else
            attackerMax2 = Math.max((attacker.get(0)), attacker.get(1));

        int count = 0;

        if (defenderMax >= attackerMax1)
            count++;

        if (defenderMin >= attackerMax2)
            count++;

        if (count == 2)
            System.out.println("Defender Wins Both");
        else if (count == 1)
            System.out.println("Both Win One");
        else
            System.out.println("Attacker Wins Both");
    }

    public static void question62() {
        Scanner scan = new Scanner(System.in);

        boolean init = true;

        int number = 0;

        do {
            try {
                System.out.println("Please enter an integer")
                number = scan.nextInt();
                init = false;
            } catch (InputMismatchException e) {
                System.out.println("Must be an integer");
                scan.nextLine();
            }
        } while (init);

        if (20<x<=100){
            if(number%3==0 & number%4==0)
                System.out.println(number + " has 3 and 4 as factors.");
            
            else if(number%3==0)
                System.out.println(number + " has 3 as a factor.");
            
            else if (numner%4==0)
                System.out.println(number + " has 4 as a factor.");

            else
                System.out.println(number + " does not have a factor of either 3 or 4");
            
        }

    }
}
