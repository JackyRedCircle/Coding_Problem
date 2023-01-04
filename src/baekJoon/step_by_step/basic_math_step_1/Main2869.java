package baekJoon.step_by_step.basic_math_step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String in = bfr.readLine();

        StringTokenizer tk = new StringTokenizer(in, " ");

        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        int v = Integer.parseInt(tk.nextToken());

        int tmp1 = v - a;
        int tmp2 = a - b;

        int day;

        day = (tmp1) / (tmp2) + 1;

        if ((tmp1) % (tmp2) != 0) day++;

        System.out.println(day);
    }
}