package baekJoon.step_by_step.use_the_1d_array;

import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double totalAve = 0;
        double[] numArr = new double[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = s.nextInt();
        }
        double max = numArr[0];
        for (int i = 1; i < n; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            numArr[i] = (numArr[i]/max)*100;
            totalAve += numArr[i];
        }
        System.out.println(totalAve/n);
    }
}
