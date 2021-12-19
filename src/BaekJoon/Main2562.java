package BaekJoon;

import java.util.Scanner;

public class Main2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numArr = new int[9];
        int max = 0;

        for (int i = 0; i < 9; i++) {
            numArr[i] = s.nextInt();
            if(i > 0 && numArr[i] > max) {
                max = numArr[i];
            }
            else {
                continue;
            }
        }
        System.out.println(max);
        for (int i = 0; i < 9; i++) {
            if (numArr[i] == max) {
                System.out.println(i+1);
                break;
            }
            else {
                continue;
            }
        }
    }
}