package baekJoon.step_by_step.basic_math_step_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int startNum = Integer.parseInt(bfr.readLine());
        int endNum = Integer.parseInt(bfr.readLine());

        boolean[] numArr = new boolean[endNum + 1];
        ArrayList<Integer> primeList = new ArrayList<>();

        for (int i = 0; i <= endNum; i++){
            numArr[i] = true;
        }

        numArr[0] = false;
        numArr[1] = false;

        for (int i = 2; i*i <= endNum; i++) if (numArr[i]) for (int j = i*i; j <= endNum; j += i) numArr[j] = false;

        for (int i = 0; i <= endNum; i++) if (numArr[i] && startNum <= i) primeList.add(i);

        int sum = 0;

        for (int primeNum : primeList) sum += primeNum;

        if (primeList.size() == 0) System.out.print(-1);

        else System.out.printf("%d\n%d", sum, primeList.get(0));
    }
}
