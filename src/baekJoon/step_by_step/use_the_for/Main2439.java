package baekJoon.step_by_step.use_the_for;

import java.io.*;

public class Main2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bfr.readLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                bfw.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bfw.write("*");
            }
            bfw.write("\n");
        }
        bfw.flush();
        bfw.close();
    }
}
