// 문제들의 정답 확인을 위한 임의의 예제를 만드는 프로그램


package BaekJoon.Use_the_1D_array;

import java.util.Scanner;

public class MakeExample {
    public static void main(String[] args) {
        M2562.createExample();
    }
}

class M10818 {
    static void createExample() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pm;
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            double k = Math.random();
            if (k > 0.5) {
                pm = -1;
            }
            else {
                pm = 1;
            }
            numArr[i] = (int)(Math.random()*1000000)*pm;
            System.out.printf(numArr[i]+" ");
        }
    }
}

class M2562 {
    static void createExample() {
        int[] numArr = new int[9];
        numArr[0] = (int)(Math.random()*100)+1;
        System.out.println(numArr[0]);
        int i = 1;
        for (int j = 1; j < 9; j++) {
            while (true) {
                numArr[i] = (int)(Math.random()*100)+1;
                if (numArr[i] != numArr[i-1]) {
                    System.out.println(numArr[i]);
                    i++;
                    break;
                }
                else {
                    continue;
                }
            }
        }
    }
}
