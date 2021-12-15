package BaekJoon.IO_and_Calculation;

import java.util.Scanner;

public class Main2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numArr = new int[2];

        for (int i = 0; i < 2; i++) {
            numArr[i] = s.nextInt();
        }
        int A = numArr[0];
        int B = numArr[1];

        int firstB = B/100;
        int secendB = (B - firstB*100)/10;
        int lastB = B - (100*firstB + 10*secendB);

        System.out.println(A*lastB);
        System.out.println(A*secendB);
        System.out.println(A*firstB);
        System.out.println(A*B);
    }
}