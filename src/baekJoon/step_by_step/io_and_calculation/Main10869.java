package baekJoon.step_by_step.io_and_calculation;

import java.util.Scanner;

public class Main10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ans = s.nextLine();

        String [] ansArr = ans.split("\\s");

        int A = Integer.parseInt(ansArr[0]);
        int B = Integer.parseInt(ansArr[1]);

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}