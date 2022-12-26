package BaekJoon;

import java.util.Scanner;

public class MakeExample {
    public static void main(String[] args) {
        M3057 m = new M3057();
        m.createExample();
    }
}

class M3057 {
    void createExample () {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(this.makeZeroOrOne(Math.random())+"");
            }
            System.out.print("\n");
        }
    }

     private int makeZeroOrOne (double d) {
        if (d < 0.5) {
            return 0;
        }
        else {
            return 1;
        }
    }
}
