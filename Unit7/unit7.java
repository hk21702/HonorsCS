package Unit7;
import java.util.*;

//package com.unit7.unit7;
public class unit7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid QID");

        boolean init = true;
        int id = 0;
        do {
            try {
                id = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid ID");
            }
            switch (id) {
            case 81:
                q81();
                init = false;
                break;
            default:
                System.out.println("Invalid ID");
                break;
            }
        } while (init);
        scan.close();
    }

    public static void q31() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scan.next();
        String y = "zZaA";

        for (int i = 0; i != word.length(); i++) {

            char x = word.charAt(i);

            if (x == y.charAt(0)) {
                x = y.charAt(2);
                System.out.print(Character.toString(x));
            } else if (x == y.charAt(1)) {
                x = y.charAt(3);
                System.out.print(Character.toString(x));
            } else {
                x += 1;
                System.out.print(Character.toString(x));
            }
        }
        scan.close();
    }

    public static void q81() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Player 1's Name.");
        String name1 = scan.next();
        System.out.println("Enter Player 2's Name.");
        String name2 = scan.next();

        int player1S = 0;
        int player2S = 0;

        System.out.println("Who would like to serve first?");
        System.out.println("Enter 1 for " + name1);
        System.out.println("Enter 2 for " + name2);
        System.out.println("Enter 3 for random selection");
        
        int selection = scan.nextInt();
        String serving = "";
        if (selection == 1) {
            serving = name1;
        } else if (selection == 2) {
            serving = name2;
        } else {
            if (((int) (Math.random() * 2)) == 0) {
                serving = name1;
            } else {
                serving = name2;
            }
        }

        int inputS = 0;
        boolean running = true;
        while (running) {
            System.out.println("Score: " + name1 + " " + player1S + ", " + name2 + " " + player2S + ", " + serving + " serves.");
            System.out.println("Who scored? Enter 1 for " + name1 + ", 2 for " + name2 + ".");

            inputS = scan.nextInt();
            if(inputS == 1)
            player1S++;
            else
            player2S++;
            
            //serve change
            if((player1S+player2S)%5 == 0){
                if(serving == name1)
                serving = name2;
                else
                serving = name1;
            }

            //win condition check
            if(player1S > 21 | player2S >21){
                if(player1S >= player2S +2)
                    running =false;
                else if (player2S >= player1S +2)
                    running = false;
            }
        }

        System.out.println("Game over");

        if (player1S > player2S) {
            System.out.println(name1 + " wins by a score of " + player1S + " to " + player2S);
        } else {
            System.out.println(name2 + " wins by a score of " + player2S + " to " + player1S);
        }

        scan.close();
    }

}