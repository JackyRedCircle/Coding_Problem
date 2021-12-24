package BaekJoon.Use_the_String;

import java.io.*;

public class Main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t = br.readLine();
        int intT = Integer.parseInt(t);
        String in;
        String[] inArr;
        String[] sArr;
        for (int i = 0; i < intT; i++) {
            in = br.readLine();
            inArr = in.split(" ");
            sArr = inArr[1].split("");
            for (int j = 0; j < sArr.length; j++) {
                for (int k = 0; k < Integer.parseInt(inArr[0]); k++) {
                    bw.write(sArr[j]);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
