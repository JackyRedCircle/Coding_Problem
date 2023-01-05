package baekJoon.step_by_step.basic_math_step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(bfr.readLine());
        int repeatTime = inputNum / 5 + 1;
        int fiveKgBagNum, threeKgBagNum, tmp;

        int[] resNumArr = new int[repeatTime];

        for (int i = 0; i < repeatTime; i++) {
            fiveKgBagNum = i;
            tmp = inputNum - 5*i;

            threeKgBagNum = tmp % 3 == 0 ? tmp / 3 : -1;

            resNumArr[i] = threeKgBagNum != -1 ? threeKgBagNum + fiveKgBagNum : 5000;
        }

        tmp = 5000;

        for (int j : resNumArr) {
            tmp = Math.min(tmp, j);
        }

        if (tmp == 5000) tmp = -1;

        System.out.printf("%d", tmp);
    }
}
