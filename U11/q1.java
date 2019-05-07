import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A[] = new int[10];
        int max, B, C, index = 0;
        for (int i = 0; i < A.length; i++) {
            max = A[0];
            index = 0;
            for (B = 0; B < A.length - i; B++) {
                if (max < A[B]) {
                    max = A[B];
                    index = B;
                }
            }
            C = A.length - 1 - i;
            while (index <= C) {
                int temp = A[index];
                A[index] = A[C];
                A[C] = temp;
                index++;
                C--;
            }
        }
        for (int D : A) {
            System.out.print(D + ", ");
        }

        
    }
}