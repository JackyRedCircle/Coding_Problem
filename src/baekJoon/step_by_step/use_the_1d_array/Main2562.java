package baekJoon.step_by_step.use_the_1d_array;

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numArr = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            numArr[i] = s.nextInt();
            if(numArr[i] > max) {
                max = numArr[i];
                index = i+1;
            }
            else {
                continue;
            }
        }
        System.out.println(max+"\n"+index);
    }
}