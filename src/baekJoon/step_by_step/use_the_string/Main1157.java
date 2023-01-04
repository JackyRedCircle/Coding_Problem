package baekJoon.step_by_step.use_the_string;
import java.util.Scanner;

public class Main1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        char[] inArr = in.toCharArray();
        int[] alphabetArr = new int[26];

        for (int i = 0; i < 26; i++) {
            alphabetArr[i] = 0;
        }

        for (int i = 0; i < 26; i++) {
            for (char c : inArr) {
                if ((int) c == ('a' + i) || (int) c == ('A' + i)) {
                    alphabetArr[i]++;
                }
            }
        }

        int tmp = alphabetArr[0];
        int index = 0;
        boolean duplication = false;
        for (int i = 1; i < 26; i++) {
            if (alphabetArr[i] > tmp) {
                tmp = alphabetArr[i];
                index = i;
            }
        }
        if (index < 25) {
            for (int i = index; i < 25; i++) {
                if (alphabetArr[i+1] == tmp) {
                    duplication = true;
                }
            }
        }

        if (duplication) {
            System.out.println("?");
        }
        else {
            System.out.println((char)(index+'A'));
        }
    }
}
