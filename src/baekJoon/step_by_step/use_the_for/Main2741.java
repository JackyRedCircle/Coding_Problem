package baekJoon.step_by_step.use_the_for;

import java.io.*;

public class Main2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = bfr.readLine();
        int integerT = Integer.parseInt(t);
        int[] numArr = new int[integerT];

        for (int i = 1; i <= integerT; i++) {
            bfw.write(i+"\n");
        }
        bfw.flush();
        bfw.close();
    }
}
