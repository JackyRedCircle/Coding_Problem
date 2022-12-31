package BaekJoon.Basic_Math_step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = Integer.parseInt(bfr.readLine());

        int [][] caseArr = new int[caseNum][3];
        String[][] roomArr = new String[caseNum][2];

        int h;
        int w;

        StringTokenizer tk;

        for (int i = 0; i < caseNum; i++) {
            tk = new StringTokenizer(bfr.readLine(), " ");

            for (int j = 0; j < 3; j++) {
                caseArr[i][j] = Integer.parseInt(tk.nextToken());
            }

            h = caseArr[i][2] % caseArr[i][0];
            w = caseArr[i][2] / caseArr[i][0];

            roomArr[i][0] = Integer.toString(h);
            roomArr[i][1] = Integer.toString(w);

            if(h != 0) {
                w++;
                roomArr[i][1] = Integer.toString(w);
            }

            else {
                roomArr[i][0] = Integer.toString(caseArr[i][0]);
            }

            if(w < 10) roomArr[i][1] = "0" + roomArr[i][1];
        }

        for (int i = 0; i < caseNum; i++){
            System.out.printf(roomArr[i][0] + roomArr[i][1] + "\n");
        }
    }
}