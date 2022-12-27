package BaekJoon;

import java.util.Scanner;

public class MakeExample {
    public static void main(String[] args) {
        M2941 m = new M2941();
        m.createExample(50);
    }
}

class M3057 {
    void createExample() {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(this.makeZeroOrOne(Math.random()) + "");
            }
            System.out.print("\n");
        }
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
                this.res += alphabetArr[(int)Math.round(Math.random() * 23)];
            }

            else {
                this.res += croatiaCharArr[(int)Math.round(Math.random() * 7)];
            }
        }

        System.out.print(this.res);
    }
}
