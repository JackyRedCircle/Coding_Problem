package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class Main2577 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        String num = a*b*c+"";
        String[] numArr = num.split("");
        int[] indexArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j <=9; j++) {
                if (Integer.parseInt(numArr[i]) == j) {
                    indexArr[j]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(indexArr[i]);
        }
    }
}
