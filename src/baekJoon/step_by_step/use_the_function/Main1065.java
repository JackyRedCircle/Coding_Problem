package baekJoon.step_by_step.use_the_function;

import java.util.Scanner;

public class Main1065 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        String in;
        String[] inArr;
        int count = 0;
        if (Integer.parseInt(n) > 99) {
            for (int i = 100; i <= Integer.parseInt(n); i++) {
                in = i+"";
                inArr = in.split("");
                if (Function.hanSuFunction(inArr)) {
                    count++;
                }
            }
            System.out.println(99+count);
        }
        else {
            System.out.println(n);
        }
    }
}

class Function {
    static boolean hanSuFunction (String[] n) {
        int count = 0;
        int[] commonDifference = new int[n.length-1];
        for (int i = 1; i < n.length; i++) {
            commonDifference[i-1] = Integer.parseInt(n[i]) - Integer.parseInt(n[i-1]);
        }
        for (int i = 1; i < n.length-1; i++) {
            if (commonDifference[i] == commonDifference[i-1]) {
                count++;
            }
        }
        if (count == n.length-2) {
            return true;
        }
        else {
            return false;
        }
    }
}
