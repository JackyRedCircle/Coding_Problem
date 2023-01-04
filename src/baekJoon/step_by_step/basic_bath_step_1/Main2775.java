package baekJoon.step_by_step.basic_bath_step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(bfr.readLine());

        int[][] caseArr = new int[caseNum][2];
        int[][] roomNumArr = new int[15][14];

        for (int i = 0; i < 14; i++) {
            roomNumArr[0][i] = i + 1;
        }

        for(int i = 0; i < caseNum; i++){
            caseArr[i][0] = Integer.parseInt(bfr.readLine());
            caseArr[i][1] = Integer.parseInt(bfr.readLine());
        }

        for(int k = 1; k <= 14; k++) {
            for(int n = 0; n < 14; n++) {
                for(int i = 0; i <= n; i++) {
                    roomNumArr[k][n] += roomNumArr[k-1][i];
                }
            }
        }

        for(int i = 0; i < caseNum; i++) {
            System.out.printf("%d\n", roomNumArr[caseArr[i][0]][caseArr[i][1] - 1]);
        }
    }
}
