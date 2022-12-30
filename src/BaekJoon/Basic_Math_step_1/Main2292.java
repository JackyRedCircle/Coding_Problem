package BaekJoon.Basic_Math_step_1;

import java.util.Scanner;

public class Main2292 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int shellNum = 0;
        int calRes = 0;
        int m = 1;

        while (n > calRes) {
            calRes = 3*m*(m-1) + 1;
            shellNum = m;
            m++;
        }

        System.out.printf("%d", shellNum);
    }
}
