import java.util.*;

import com.sun.tools.internal.ws.wsdl.document.Input;

public class unit5 {
    public static void main(String[] args) {
        boolean init = true;
        Scanner scan = new Scanner(System.in);
        int iD;
        do {
            System.out.println("Enter question ID");

            try {
                iD = scan.nextInt();

                switch (iD) {
                case 74:
                    init = false;
                    q74();
                    break;
                default:
                    System.out.println("Invalid ID.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID type");
            }
        } while (init);
    }

    public static void q74() {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean init = true;
        int base = 0;
        double input = 0;

        HashMap<Integer, String> baseSystem = new HashMap<>();

        baseSystem.put(10, "A");
        baseSystem.put(11, "B");
        baseSystem.put(12, "C");
        baseSystem.put(13, "D");
        baseSystem.put(14, "E");
        baseSystem.put(15, "F");

        do {
            System.out.println("Enter a base.");
            try {
                base = scan.nextInt();
                if (base > 16)
                    throw new InputMismatchException();
                init = false;
            } catch (InputMismatchException e) {
                System.out.println("Base must be an integer and can not exceed base 16");
            }
        } while (init);

        init = true;

        do {
            System.out.println("Enter a decimal number 1-1000.");
            try {
                input = scan.nextDouble();
                init = false;
            } catch (InputMismatchException exception) {
                System.out.println("Base must be a decimal or floating point decimal.");
            }
        } while (init);
        int placeCount = 0;
        while (input > 0) {
            int x = 2;
            // int count = 0;
            while (x >= 1) {
                count++;
                x = (int) (input / Math.pow(base, count));
            }
           // System.out.println(x); // x should exit as 0
            //System.out.println(Math.pow(base, count)); // value that caused x to be 0
            count--; // reset back one power
            map.put(placeCount, (int) (input / Math.pow(base, count)));
            input=input%Math.pow(base, count);
          //  for(int i = count){  need to correct and add place values/0 values

            //}
            placeCount++;
        }

        if (base <= 10) {
            for (int i = placeCount-1; i >= 0; i--) {
                System.out.print(map.get(i));
            }
        }

    }
}