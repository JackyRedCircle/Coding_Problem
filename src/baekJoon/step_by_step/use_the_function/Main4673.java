package baekJoon.step_by_step.use_the_function;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main4673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
        Calculation c = new Calculation();
        String num = "";
        boolean val;
        for (int i = 1; i < 10000; i++) {
            num += c.d(i)+" ";
        }
        String[] numArr = num.split(" ");
        for (int i = 1; i < 10000; i++) {
            val = false;
            for (int j = 0; j < numArr.length; j++) {
                if (Integer.parseInt(numArr[j]) == i) {
                    val = true;
                    break;
                }
            }
            if (val == false) {
                b.write(i+"\n");
            }
        }
        b.flush();
        b.close();
    }
}

class Calculation {
    int d (int n) {
        String m = n+"";
        String[] inArr = m.split("");
        int tmp = Integer.parseInt(m);
        for (int i = 0; i < inArr.length; i++) {
            tmp += Integer.parseInt(inArr[i]);
        }
        return tmp;
    }
}
