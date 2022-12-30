package BaekJoon.Basic_Math_step_1;

import java.util.Scanner;

public class Main1712 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (b == c) {
            System.out.print("-1");
        }

        else {
            double n = a * 1.0 / (c - b);

            if (n < 0) System.out.print("-1");

            else {
                System.out.printf("%d", (int)(n + 1));
            }
        }
    }
}
