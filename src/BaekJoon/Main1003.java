package BaekJoon;

import java.util.Scanner;
// [1003]
public class Main1003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tNum = s.nextInt();

        int[] numArr = new int[tNum];

        for (int i = 0; i < tNum; i++) {
            numArr[i] = s.nextInt();
        }

        for (int i = 0; i < tNum; i++) {
            int fir = 1;
            int sec = 1;

            if (numArr[i] == 0) {
                System.out.println("1 0");
            }
            else if (numArr[i] == 1) {
                System.out.println("0 1");
            }
            else {
                for (int j = 2; j <= numArr[i]-1; j++) {
                    int tmp = fir;
                    fir += sec;
                    sec = tmp;
                }
                System.out.println(sec+ " " + fir);
            }
        }
    }
}