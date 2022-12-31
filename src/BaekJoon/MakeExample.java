package BaekJoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MakeExample {
    public static void main(String[] args) throws IOException {
        M3057 m = new M3057();
        m.createExample();
    }
}

class M3057 {
    void createExample() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String in = bfr.readLine();
        StringTokenizer st = new StringTokenizer(in, " ");
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bfw.write(this.makeZeroOrOne(Math.random()) + "");
            }
            bfw.write("\n");
        }
        bfw.flush();
        bfw.close();
    }

    private int makeZeroOrOne(double d) {
        if (d < 0.5) {
            return 0;
        } else {
            return 1;
        }
    }
}

class M2941 {

    String[] croatiaCharArr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    String res = "";

    char[] alphabetArr = new char[26];
    double randomRes;

    M2941() {
        for(int i = 'a'; i <= 'z'; i++){
            this.alphabetArr[i - 'a'] = (char)i;
        }
    }

    void createExample(int charNum) {

        while(res.length() < charNum) {
            this.randomRes = Math.random();

            if(this.randomRes > 0.7) {
                this.res += alphabetArr[(int)Math.round(Math.random() * 25)];
            }

            else {
                this.res += croatiaCharArr[(int)Math.round(Math.random() * 7)];
            }
        }

        System.out.print(this.res);
    }
}

class M1316 {

    String buff = "";

    char[] alphabetArr = new char[26];
    M1316() {
        for(int i = 'a'; i <= 'z'; i++){
            this.alphabetArr[i - 'a'] = (char)i;
        }
    }

    void createExample(int charNum) {
        for (int i = 0; i < charNum; i++) {
            char tmp = this.alphabetArr[(int)Math.round(Math.random() * 25)];
            for (int j = 0; j < (int)Math.round(Math.random() * 20); j++) {
                buff += tmp;
            }
        }

        System.out.print(buff);
    }
}
