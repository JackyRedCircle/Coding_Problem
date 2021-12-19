package BaekJoon.Use_the_for;

import java.io.*;

public class Main2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = bfr.readLine();
        int integerT = Integer.parseInt(t);
        int[] numArr = new int[integerT];

        for (int i = 0; i < integerT; i++) {
            bfw.write((integerT-i)+"\n");
        }
        bfw.flush();
        bfw.close();
    }
}
