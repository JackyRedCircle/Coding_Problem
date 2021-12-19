package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numArr = new int[9];

        for (int i = 1; i < 9; i++) {
            numArr[i] = s.nextInt();
        }

        int tmp = numArr[0];

        for (int i = 1; i < 9; i++) {
            if(numArr[i] > tmp) {
                tmp = numArr[i];
            }
            else {
                continue;
            }
        }

        for  (int i = 0; i < 9; i++) {
            if (tmp == numArr[i]) {
                System.out.println(tmp);
                System.out.println(i);
            }
            else {
                continue;
            }
        }
    }
}
