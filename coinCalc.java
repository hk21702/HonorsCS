import java.util.*;

public class coinCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> currencyArrayList = new ArrayList<Integer>();
        ArrayList<String> currency = new ArrayList<String>(Arrays.asList("50 Dollar Bill", "20 Dollar Bill",
                "10 Dollar Bill", "5 Dollar Bill", "1 Dollar Bill", "Quarter", "Dime", "Nickel", "Penny"));
        int currencyM[] = { 5000, 2000, 1000, 500, 100, 25, 10, 5, 1 };

        double money = scan.nextDouble() * 100;

        for (int x = 0; x < currency.size(); x++) {
            currencyArrayList.add(x, (int) Math.floor(money / currencyM[x]));
            money = money % currencyM[x];
        }

        int y = 0;

        for (int x = 0; x < currencyArrayList.size(); x++) {
            if (currencyArrayList.get(x) >= 1 && x != 8) {
                if (y != 0) {
                    System.out.print(", ");
                }
                System.out.print(currencyArrayList.get(x) + " " + currency.get(x));
                y++;
                if (currencyArrayList.get(x) != 1 && x != 8) {
                    System.out.print("s");
                }
            } else if (currencyArrayList.get(x) >= 1 && x == 8) {
                if (y != 0) {
                    System.out.print(", ");
                }
                System.out.print(currencyArrayList.get(x));
                y++;
                if (currencyArrayList.get(x) == 1) {
                    System.out.print(" Penny");
                } else {
                    System.out.print(" Pennies");
                }
            }
        }
        scan.close();
    }
}