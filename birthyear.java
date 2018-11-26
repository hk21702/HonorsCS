import java.util.Scanner;
public class birthyear {
    public static void main(String[] args) {
        int currentYear;
        int age;
        boolean birthDayThisYear;
        int birthYear;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the current year");
        currentYear = scan.nextInt();

        System.out.println("Enter your age");
        age = scan.nextInt();

        System.out.println("Did you have your birthday yet this year?");

        if (scan.next() == "yes") {
            birthDayThisYear = true;
        } else {
            birthDayThisYear = false;
        }
        //System.out.print(birthDayThisYear);
        if (birthDayThisYear == true) {
            birthYear = currentYear - age;
        } else {
            birthYear = currentYear - age + 1;
        }
        System.out.println("You were born in" + birthYear + ".");
        
        scan.close();
    }
}