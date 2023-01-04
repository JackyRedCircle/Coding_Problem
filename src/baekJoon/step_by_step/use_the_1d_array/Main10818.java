package baekJoon.step_by_step.use_the_1d_array;

import java.io.*;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = bfr.readLine();
        int integerN = Integer.parseInt(n);

        String numData = bfr.readLine();
        String[] numArr = numData.split(" ");

        int max = Integer.parseInt(numArr[0]);
        int min = Integer.parseInt(numArr[0]);

        for (int i = 1; i < integerN; i++) {
            int num = Integer.parseInt(numArr[i]);
            if (num > max) {
                max = num;
            }
            else {
                if (num < min) {
                    min = num;
                }
                else {
                    continue;
                }
            }
        }

        bfw.write(min+" "+max);

        bfw.flush();
        bfw.close();
    }
}
