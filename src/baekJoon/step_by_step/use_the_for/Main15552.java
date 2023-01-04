package baekJoon.step_by_step.use_the_for;

import java.io.*;

public class Main15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tNum = Integer.parseInt(bf.readLine());
        String[] numArr = new String[tNum];
        int[] ansArr = new int[tNum];

        for (int i = 0; i < tNum; i++) {
            numArr[i] = bf.readLine();
            String [] abArr = numArr[i].split("\\s");
            ansArr[i] = Integer.parseInt(abArr[0])+Integer.parseInt(abArr[1]);
        }

        for (int i = 0; i < tNum; i++) {
            bw.write(ansArr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
