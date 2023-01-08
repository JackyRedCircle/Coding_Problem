package baekJoon.step_by_step.basic_math_step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String inputLine = bfr.readLine(), strA, strB;

        StringTokenizer stk = new StringTokenizer(inputLine," ");

        strA = stk.nextToken();
        strB = stk.nextToken();

        int maxLen = Math.max(strA.length(), strB.length());

        int[] aIntArr = new int[maxLen + 1];
        int[] bIntArr = new int[maxLen + 1];

        for (int i = strA.length() - 1, j = 0; i >= 0; i--, j++)
            aIntArr[j] = strA.charAt(i) - '0';

        for (int i = strB.length() - 1, j = 0; i >= 0; i--, j++)
            bIntArr[j] = strB.charAt(i) - '0';

        for (int i = 0; i < maxLen; i++) {
            aIntArr[i] += bIntArr[i];
            aIntArr[i + 1] += aIntArr[i] / 10;
            aIntArr[i] %= 10;
        }

        if (aIntArr[maxLen] != 0) System.out.printf("%d", aIntArr[maxLen]);

        for (int i = maxLen - 1; i >= 0; i--)
            System.out.printf("%d", aIntArr[i]);
    }
}
