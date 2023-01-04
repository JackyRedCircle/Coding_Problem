package baekJoon.step_by_step.use_the_while;

import java.util.Scanner;

public class Main1110 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        int count = 0;
        String firstTmp = num;
        String secendTmp = "";
        char[] ftArr;
        char[] stArr;

        do {
            firstTmp = Transeval.transeVal(firstTmp);
            ftArr = firstTmp.toCharArray();
            int addFirstTmp = ftArr[0] + ftArr[1]-2*'0';
            secendTmp = Transeval.transeVal(addFirstTmp+"");
            stArr = secendTmp.toCharArray();
            int k = Integer.parseInt(Character.toString(ftArr[1])+Character.toString(stArr[1]));
            firstTmp = k+"";
            count++;
        } while (firstTmp.equals(num) == false);

        System.out.println(count);
    }
}

class Transeval {
    static String transeVal (String val) {
        if (Integer.parseInt(val) < 10) {
            val = "0"+val;
            return val;
        }
        else {
            return val;
        }
    }
}
