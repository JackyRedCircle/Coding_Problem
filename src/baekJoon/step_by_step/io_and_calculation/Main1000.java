package baekJoon.step_by_step.io_and_calculation;

import java.util.Scanner;

public class Main1000 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String ans = s.nextLine();

        String [] ansArr = ans.split("\\s");

        System.out.println(Integer.parseInt(ansArr[0])+Integer.parseInt(ansArr[1]));

    }
}