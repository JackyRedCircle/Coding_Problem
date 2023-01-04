package baekJoon.step_by_step.use_the_string;

import java.util.Scanner;

public class Main1152 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.nextLine();
        String[] inArr = in.split(" ");

        if (in.equals(" ")) {
            System.out.println("0");
        }

        else if (inArr[0].equals("")) {
            System.out.println(inArr.length-1);
        }
        else {
            System.out.println(inArr.length);
        }
    }
}
