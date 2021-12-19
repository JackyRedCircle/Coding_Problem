package BaekJoon.Use_the_for;

import java.util.Scanner;

public class Main10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n_x = s.nextLine();
        String[] nxArr = n_x.split(" ");
        int n = Integer.parseInt(nxArr[0]);
        int x = Integer.parseInt(nxArr[1]);

        String a = s.nextLine();
        String[] aArr = a.split(" ");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(aArr[i]) < x) {
                System.out.printf(aArr[i]+" ");
            }
            else {
                continue;
            }
        }
    }
}
