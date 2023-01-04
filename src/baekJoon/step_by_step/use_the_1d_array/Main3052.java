package baekJoon.step_by_step.use_the_1d_array;

import java.util.Scanner;

public class Main3052 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] inputNumArr = new int[10];
        int[] remainderArr = new int[10];
        int kinds = 0;
        for (int i = 0; i < 10; i++) {
            inputNumArr[i] = s.nextInt();
            remainderArr[i] = inputNumArr[i]%42;
        }

        int tmp;
        int count;

        for (int i = 0; i < 10; i++) {
            count = 0;
            tmp = remainderArr[i];
            for (int j = i+1; j < 10; j++) {
                if (remainderArr[j] == tmp) {
                    count++;
                }
            }
            if (count == 0) {
                kinds++;
            }
        }
        System.out.println(kinds);
    }
}
