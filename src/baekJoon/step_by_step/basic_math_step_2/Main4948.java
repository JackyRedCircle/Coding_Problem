package baekJoon.step_by_step.basic_math_step_2;

import java.io.*;
import java.util.ArrayList;

public class Main4948 {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> inputList = new ArrayList<>();

        int index = -1;

        do {
            inputList.add(bfr.readLine());
            index++;
        } while (Integer.parseInt(inputList.get(index)) != 0);

        int startNum, endNum, count;

        for (String inputStr : inputList) {
            if (Integer.parseInt(inputStr) == 0) break;

            count = 0;

            startNum = Integer.parseInt(inputStr);
            endNum = startNum*2;

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

            for (int i = 2; i <= endNum; i++) {
                if (startNum < i && i <= endNum && numArr[i]) count++;
            }

            bfw.write(Integer.toString(count));
            bfw.newLine();
        }

        bfw.flush();
        bfw.close();
    }
}