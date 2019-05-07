import java.util.*;

public class u11q2{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();

        System.out.println("Please enter a letter");
        String letter1 = scan.next();
        char letter = letter1.charAt(0);
        int sentenceLength = sentence.length();
         int positionCheck []= new int[sentenceLength];
        int count = 0;
        for(int i = 0; i< sentenceLength; i++){
            if(sentence.charAt(i)==letter){
                positionCheck[count] = i;
                count++;
            }
        }
        System.out.println("there are  "+  count + " " +letter1+"'s'");
        if(count != 0)
        System.out.println("The first one is at index " + positionCheck[0]);
    }
}