package baekJoon.step_by_step.basic_math_step_2;

import java.io.*;
import java.util.StringTokenizer;

public class Main1929 {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = bfr.readLine();

        StringTokenizer tk = new StringTokenizer(inputStr," ");

        int startNum = Integer.parseInt(tk.nextToken());
        int endNum = Integer.parseInt(tk.nextToken());

        boolean[] numArr = new boolean[endNum + 1];
        for (int i = 0; i <= endNum; i++){
            numArr[i] = true;
        }

        numArr[0] = false;
        numArr[1] = false;

        if (4 <= endNum && numArr[2]) {
            for (int i = 4; i <= endNum; i += 2) numArr[i] = false;
        }

        for (int i = 3; i*i <= endNum; i+=2) if (numArr[i]) for (int j = i*i; j <= endNum; j += i) numArr[j] = false;

        for (int i = 0; i <= endNum; i++) {
            if (numArr[i] && startNum <= i) {
                bfw.write(Integer.toString(i));
                bfw.newLine();
            }
        }

        bfw.flush();
        bfw.close();
    }
}