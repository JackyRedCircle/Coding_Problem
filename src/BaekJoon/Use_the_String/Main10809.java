package BaekJoon.Use_the_String;

import java.util.Scanner;

public class Main10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        boolean ox;
        char[] inArr = in.toCharArray();
        int[] alphabetArr = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetArr[i] = -1;
        }

        for (int i = 0; i < 26; i++) {
            ox = false;
            for (int j = 0; j < inArr.length; j++) {
                if ((i+97) == (int)(inArr[j])) {
                    alphabetArr[i] = j;
                    ox = true;
                    break;
                }
            }
            System.out.printf(alphabetArr[i]+" ");
        }
    }
}
