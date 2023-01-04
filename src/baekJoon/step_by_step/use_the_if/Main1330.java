package baekJoon.step_by_step.use_the_if;

import java.util.Scanner;

public class Main1330 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ans = s.nextLine();

        String [] ansArr = ans.split("\\s");

        int a = Integer.parseInt(ansArr[0]);
        int b = Integer.parseInt(ansArr[1]);

        if (a>b) {
            System.out.println(">");
        }
        else if (a<b) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }
    }
}
