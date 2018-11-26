import java.util.*;

public class testq3{
    public static void main(String[]args){
        int number1 = 10;
        int number2 = 2;
        
        while (number1>9 | number1 <3){
            number1 =(int) (Math.random()*10);
        }

        System.out.println(number1);
        while (number2>4 | number2 <3){
            number2 =(int) (Math.random()*10);
        }
        System.out.println(number1+number2);
    }
}