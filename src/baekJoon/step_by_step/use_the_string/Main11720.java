package baekJoon.step_by_step.use_the_string;

import java.util.Scanner;

public class Main11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int addNum = 0;
        s.nextLine();
        String num = s.nextLine();
        String[] numArr = num.split("");
        for (int i = 0; i < n; i++) {
            addNum += Integer.parseInt(numArr[i]);
        }
        System.out.println(addNum);
    }
}
