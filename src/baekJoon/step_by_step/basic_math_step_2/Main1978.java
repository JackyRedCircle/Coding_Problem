package baekJoon.step_by_step.basic_math_step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(bfr.readLine());

        int[] caseArr = new int[caseNum];

        String strCase = bfr.readLine();

        StringTokenizer tk = new StringTokenizer(strCase, " ");

        for (int i = 0; i < caseNum; i++) {
            caseArr[i] = Integer.parseInt(tk.nextToken());
        }

        boolean[] numArr = new boolean[1001];
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 0; i <= 1000; i++){
            numArr[i] = true;
        }

        numArr[0] = false;
        numArr[1] = false;

        for (int i = 2; i*i <= 1000; i++) if (numArr[i]) for (int j = i*i; j <= 1000; j += i) numArr[j] = false;

        for (int i = 0; i <= 1000; i++) if (numArr[i]) primeList.add(i);

        int[] primeArr = new int[primeList.size()];
        int index = 0;

        for (int primeNum : primeList) primeArr[index++] = primeNum;

        int primeCount = 0;

        for (int caseVal : caseArr) {
            for (int primeNum : primeArr) {
                if (caseVal == primeNum) {
                    primeCount++;
                    break;
                }
            }
        }

        System.out.print(primeCount);
    }
}
