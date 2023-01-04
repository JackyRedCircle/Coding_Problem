package baekJoon.step_by_step.use_the_while;

import java.util.Scanner;

public class Main10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;

        while (s.hasNextInt()) {
            a = s.nextInt();
            b = s.nextInt();
            System.out.println(a+b);
        }
    }
}