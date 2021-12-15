package BaekJoon.Use_the_if;

import java.util.Scanner;

public class Main14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numArr = new int[2];

        for (int i = 0; i < 2; i++) {
            numArr[i] = s.nextInt();
        }

        int x = numArr[0];
        int y = numArr[1];

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            }
            else {
                System.out.println("4");
            }
        }
        else {
            if (y > 0) {
                System.out.println("2");
            }
            else {
                System.out.println("3");
            }
        }
    }
}
