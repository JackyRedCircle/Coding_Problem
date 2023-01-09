package baekJoon.step_by_step.basic_math_step_2;

import java.io.*;

public class Main11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(bfr.readLine());

        for (int i = 2; i <= Math.sqrt(inputNum); i++) {
            while (inputNum % i == 0) {
                inputNum /= i;
                bfw.write(Integer.toString(i));
                bfw.newLine();
            }
        }

        if (inputNum != 1) {
            bfw.write(Integer.toString(inputNum));
        }


        bfw.flush();
        bfw.close();
    }
}
