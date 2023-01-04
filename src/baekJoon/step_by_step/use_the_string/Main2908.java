package baekJoon.step_by_step.use_the_string;

import java.util.Scanner;

public class Main2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        String[] inArr = in.split(" ");
        String[] n1Arr = inArr[0].split("");
        String[] n2Arr = inArr[1].split("");
        inArr[0] = "";
        inArr[1] = "";
        boolean tmp = false;
        for (int i = 0; i < 3; i++) {
            inArr[0] += n1Arr[2-i];
            inArr[1] += n2Arr[2-i];
        }
        if (Integer.parseInt(inArr[0]) > Integer.parseInt(inArr[1])) {
            tmp = true;
        }
        if (tmp) {
            System.out.println(inArr[0]);
        }
        else {
            System.out.println(inArr[1]);
        }
    }
}
