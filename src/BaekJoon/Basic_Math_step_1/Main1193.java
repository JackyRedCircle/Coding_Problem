package BaekJoon.Basic_Math_step_1;

import java.util.Scanner;

public class Main1193 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int n = 1;
        int floor = 0, calRes = 0, numerator = 0;
        while (N > calRes) {
            calRes = n * (n + 1) / 2;
            floor = n;
            n++;
        }

        numerator = (floor - (calRes - N));

        if (floor % 2 != 0){
            numerator = floor + 1 - numerator;
        }

        System.out.printf("%d/%d", numerator, floor + 1 - numerator);
    }
}