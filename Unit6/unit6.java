import java.util.*;

public class unit6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean init = true;
        boolean init2 = true;
        int qID = 0;
        do {
            do {
                System.out.print("Enter qID: ");
                if (scan.hasNextInt()) {
                    qID = scan.nextInt();
                    init2 = false;
                } else
                    System.out.println("Invalid ID");
                scan.nextLine();
            } while (init2);

            switch (qID) {
            case 14:
                q14();
                init = false;
                break;
            case 15:
                q15();
                init = false;
                break;
            case 22:
                q22();
                init = false;
                break;
            case 35:
                q35();
                init = false;
                break;
            default:
                System.out.println("Invalid qID");
                init2 = true;
                break;
            }
        } while (init);

    }

    public static void q14() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 words");
        String word1 = scan.next(), word2 = scan.next();

        System.out.println(word2.toLowerCase() + " " + word1.toUpperCase());
    }

    public static void q15() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character");
        String chara = scan.next();
        System.out.println("The decimal value assinged to " + chara + " is " + ((int) chara.charAt(0)));
    }

    public static void q22() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word.");
        String chara = scan.next();
        chara = chara.toUpperCase();
        char a = chara.charAt(chara.length() - 1);
        System.out.println("The last letter of " + chara + " is " + a);
    }

    public static void q35() {
        Scanner scan = new Scanner(System.in);
        String word1;
        do {
            System.out.println("Please enter a word atleast two characters long");
            word1 = scan.next();
        } while (word1.length() < 2);
        int place1 =(int) (Math.random() * word1.length()), place2 = -1;
        System.out.println(place1);
        while (place2 == -1 | place2 == place1) {
            place2 =(int) (Math.random() * word1.length());
            System.out.println(place2);
        }

        int dp1 = Math.min(place1, place2);
        int dp2 = Math.max(place1, place2);
        String w1 = word1.substring(0,dp1);
        System.out.println(w1);
        char c1 = word1.charAt(dp1);
        System.out.println(c1);

        String w2 = word1.substring(dp2);
        char c2 = word1.charAt(dp2);

        String w3 = word1.substring(dp2+1,word1.length());

        System.out.println(w1+c1+w2+c2+w3);
    }
}
