import java.util.Scanner;
import java.util.Arrays;

public class event{
    public static void main(String[] args){
        //0 is hours, 1 is minutes, 2 is seconds
        int[] start = new int[3];
        int[] end = new int[3];
        int[] output = new int[3];

        Scanner in = new Scanner(System.in);

        System.out.println("What is the event start time? Hours, Minutes, Seconds");
        start[0] = in.nextInt();
        start[1] = in.nextInt();
        start[2] = in.nextInt();


        System.out.println("What is the event end time? Hours, Minutes, Seconds");
        end[0] = in.nextInt();
        end[1] = in.nextInt();
        end[2] = in.nextInt();

        start[1] = start[0]*60+start[1]; //convert all to minutes
        start[2] = start[1]*60+start[2];
       
        end[1] = end[0]*60+end[1]; //convert all to seconds
        end[2] = end[1]*60+end[2]; 
       
        output[2] = end[2]-start[2]; //calculate output in seconds 

        output[1] = output[2]/60; //convert seconds to minutes + seconds
        output[2] = output[2]%60;

        output[0] = output[1]/60; //convert minutes to hours + minutes
        output[1] = output[1]%60;

        System.out.println(+output[0]+" Hours, "+output[1]+" Minutes, "+output[2]+" Seconds");
        in.close();


    }
}